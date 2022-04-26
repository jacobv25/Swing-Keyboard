package main.Panels;

import main.Buttons.DMS_Button;
import main.Buttons.Keys.KeyboardKey;
import main.DMS_RealtimePlayer;
import org.jfugue.pattern.Pattern;
import org.jfugue.theory.Note;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoteRecordSheetPanel extends JPanel implements ActionListener {

    private JTextArea recordSheet;
    private boolean isRecording;

    public NoteRecordSheetPanel(){
        isRecording = false;
        recordSheet = new JTextArea();
        add(recordSheet);
    }

    public JTextArea getRecordSheet() {
        return recordSheet;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("AP");
        if(e.getSource() instanceof DMS_Button) {
            DMS_Button button = (DMS_Button) e.getSource();
            if (button.getText().equals("Record")) {
                isRecording = !isRecording;
            } else if (button.getText().equals("Play")) {
                playRecordSheet();
            } else {
                throw new IllegalArgumentException("WIERD ERROR\n" +
                        "THIS IS NOT SUPPOSED TO HAPPEN");
            }
        }
        else if (e.getSource() instanceof KeyboardKey) {
            System.out.println("Keyboard key pressed.");
            Note note = new Note((String)((KeyboardKey) e.getSource()).getClientProperty("text"));
            recordNote(note);
        }
    }

    private void playRecordSheet(){
        try {
            String notes = recordSheet.getText();
            Pattern pattern = new Pattern(notes);
            DMS_RealtimePlayer.getInstance().play(pattern);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    private void recordNote(Note note) {
        if(isRecording)
            recordSheet.append(note.originalString + " ");
    }
}
