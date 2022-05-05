package main.Buttons.Keys;

import main.DMS_RealtimePlayer;
import org.jfugue.theory.Note;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public abstract class KeyboardKey extends JButton implements ItemListener {

    private String instrument;
    public KeyboardKey(String key) {
        setFont(new Font(".AppleSystemUIFont", 0,13));
        setText(key);
        setVerticalAlignment(TOP);
        setVerticalTextPosition(TOP);
        setUpPlayNoteWhenPressed();
        putClientProperty("text", getText());
    }

    public void itemStateChanged(ItemEvent event){
        JRadioButtonMenuItem radioButton = (JRadioButtonMenuItem)event.getSource();
        if (radioButton.getText() == "Piano") {
            try {
                DMS_RealtimePlayer.getInstance().changeInstrument("Piano");
            } catch (MidiUnavailableException e) {
                e.printStackTrace();
            }

        } else if (radioButton.getText() == "Guitar") {
            try {
                DMS_RealtimePlayer.getInstance().changeInstrument("Guitar");
            } catch (MidiUnavailableException e) {
                e.printStackTrace();
            }
        }
        else if (radioButton.getText() == "Flute") {
            try {
                DMS_RealtimePlayer.getInstance().changeInstrument("Flute");
            } catch (MidiUnavailableException e) {
                e.printStackTrace();
            }
        }
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
