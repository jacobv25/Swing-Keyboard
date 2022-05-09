package main.Buttons.Keys;

import main.DMS_RealtimePlayer;
import org.jfugue.theory.Note;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public abstract class KeyboardKey extends JButton implements ItemListener {

    public KeyboardKey(String key) {
        setFont(new Font(".AppleSystemUIFont", 0,13));
        setText(key);
        setVerticalAlignment(TOP);
        setVerticalTextPosition(TOP);
        setUpPlayNoteWhenPressed();
        putClientProperty("text", getText());
    }

    @Override
    public void itemStateChanged(ItemEvent event){
        JRadioButtonMenuItem radioButton = (JRadioButtonMenuItem)event.getSource();
        changeInstrumentDependingOnRadioButtonSelected(radioButton);
    }

    private void changeInstrumentDependingOnRadioButtonSelected(JRadioButtonMenuItem radioButton) {
        try {
            if (radioButton.getText() == "Piano") {
                DMS_RealtimePlayer.getInstance().changeInstrument("Piano");
            } else if (radioButton.getText() == "Guitar") {
                DMS_RealtimePlayer.getInstance().changeInstrument("Guitar");
            } else if (radioButton.getText() == "Flute") {
                DMS_RealtimePlayer.getInstance().changeInstrument("Flute");
            }
        }
        catch (MidiUnavailableException e) {
            e.printStackTrace();
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
