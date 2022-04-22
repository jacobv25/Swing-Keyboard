package main.Keys;

import main.DMS_RealtimePlayer;
import main.Panels.NoteRecordSheetPanel;
import org.jfugue.theory.Note;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class KeyboardKey extends JButton {

    NoteRecordSheetPanel recordSheet;

    public KeyboardKey(String key) throws MidiUnavailableException {
        setFont(new Font(".AppleSystemUIFont", 0,13));
        setText(key);
        setVerticalAlignment(TOP);
        setVerticalTextPosition(TOP);
        addActionListener();
    }

    protected void playNote(ActionEvent event) throws MidiUnavailableException {
        Note note = new Note(getText());
        DMS_RealtimePlayer.getInstance().startNote(note);
        recordSheet.recordNote(note);
    }

    protected void addActionListener(){
        addActionListener(e -> {
            try {
                playNote(e);
            }
            catch (MidiUnavailableException ex) {
                ex.printStackTrace();
            }
        });
    }

    public void setRecordSheet(NoteRecordSheetPanel recordSheet) {
        this.recordSheet = recordSheet;
    }
}
