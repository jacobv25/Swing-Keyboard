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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(isDMS_Button(e)) {
            handleDMS_ButtonPress(e);
        }
        else if (isKeyboardKey(e)) {
            handleKeyboardKeyPress(e);
        }
    }

    private void handleKeyboardKeyPress(ActionEvent e) {
        Note note = new Note((String)((KeyboardKey) e.getSource()).getClientProperty("text"));
        recordNote(note);
    }

    private void handleDMS_ButtonPress(ActionEvent e) {
        DMS_Button button = (DMS_Button) e.getSource();
        if (isRecordButton(button)) {
            isRecording = !isRecording;
        } else if (isPlayButton(button)) {
            playRecordSheet();
        } else {
            throw new IllegalArgumentException("WIERD ERROR\n" +
                    "THIS IS NOT SUPPOSED TO HAPPEN");
        }
    }

    private boolean isPlayButton(DMS_Button button) {
        return button.getText().equals("Play");
    }

    private boolean isRecordButton(DMS_Button button) {
        return button.getText().equals("Record");
    }

    private boolean isKeyboardKey(ActionEvent e) {
        return e.getSource() instanceof KeyboardKey;
    }

    private boolean isDMS_Button(ActionEvent e) {
        return e.getSource() instanceof DMS_Button;
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
