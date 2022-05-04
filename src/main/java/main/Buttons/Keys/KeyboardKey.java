package main.Buttons.Keys;

import main.DMS_RealtimePlayer;
import org.jfugue.theory.Note;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class KeyboardKey extends JButton {

    public KeyboardKey(String key) {
        setFont(new Font(".AppleSystemUIFont", 0,13));
        setText(key);
        setVerticalAlignment(TOP);
        setVerticalTextPosition(TOP);
        setUpPlayNoteWhenPressed();
        putClientProperty("text", getText());
    }

    protected void playNote(ActionEvent event) throws MidiUnavailableException {
        Note note = new Note(getText());
        DMS_RealtimePlayer.getInstance().startNote(note);
    }

    protected void setUpPlayNoteWhenPressed(){
        addActionListener(e -> {
            try {
                playNote(e);
            }
            catch (MidiUnavailableException ex) {
                ex.printStackTrace();
            }
        });
    }
}
