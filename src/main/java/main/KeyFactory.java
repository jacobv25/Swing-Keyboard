package main;

import main.Buttons.Keys.KeyboardKey;
import main.Buttons.Keys.WhiteKey;

import javax.sound.midi.MidiUnavailableException;
import java.awt.event.ActionListener;

public class KeyFactory {
    KeyboardKey key;

    public KeyFactory(String keyVal, ActionListener listener) throws MidiUnavailableException {
        key = new WhiteKey("C");
        key.addActionListener(listener);
    }
}
