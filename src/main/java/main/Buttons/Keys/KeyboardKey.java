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
        System.out.println("event was heard");
        JRadioButtonMenuItem radioButton = (JRadioButtonMenuItem)event.getSource();
        if (radioButton.getText()=="Piano"){
            instrument = "Piano";
        }
        else if (radioButton.getText()=="Flute"){
            instrument = "Flute";
            System.out.println("flute was selected");
        }
        else if (radioButton.getText()=="Guitar"){
            instrument = "Guitar";
        }
    }
    protected void playNote(ActionEvent event) throws MidiUnavailableException {
        System.out.println(instrument);
        Note note = new Note("I[" + instrument + "]" + getText());
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
