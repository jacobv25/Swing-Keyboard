package main.Panels;

import main.Keys.BlackKey;
import main.Keys.WhiteKey;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;

public class KeyboardPanel extends JPanel {
    public KeyboardPanel() throws MidiUnavailableException {
        add(new WhiteKey("C"));
        add(new BlackKey("C#"));
        add(new WhiteKey("D"));
        add(new BlackKey("D#"));
        add(new WhiteKey("E"));
        add(new WhiteKey("F"));
        add(new BlackKey("F#"));
        add(new WhiteKey("G"));
        add(new BlackKey("G#"));
        add(new WhiteKey("A"));
        add(new BlackKey("A#"));
        add(new WhiteKey("B"));
        add(new WhiteKey("C6"));
    }
}
