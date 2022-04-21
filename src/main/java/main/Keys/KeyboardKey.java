package main.Keys;

import main.DMS_RealtimePlayer;
import org.jfugue.theory.Note;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class KeyboardKey extends JButton {

    public KeyboardKey(String key) throws MidiUnavailableException {
        setFont(new Font(".AppleSystemUIFont", 0,13));
        setText(key);
        setVerticalAlignment(TOP);
        setVerticalTextPosition(TOP);
        addActionListener();
    }

    protected void keyActionPerformed(ActionEvent event) throws MidiUnavailableException {
        System.out.println(getText());
        DMS_RealtimePlayer.getInstance().startNote(new Note(getText()));
    }

    protected void addActionListener(){
        addActionListener(e -> {
            try {
                keyActionPerformed(e);
            } catch (MidiUnavailableException ex) {
                ex.printStackTrace();
            }
        });
    }
}
