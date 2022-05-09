package main.Factories;

import main.Buttons.Keys.BlackKey;
import main.Buttons.Keys.KeyboardKey;
import main.Buttons.Keys.WhiteKey;

import javax.sound.midi.MidiUnavailableException;
import java.awt.event.ActionListener;

public class KeyboardKeyFactory {
    public KeyboardKey createKeyboardKey(String colorDiscriminator, String keyDiscriminator, ActionListener listener) throws MidiUnavailableException {
        KeyboardKey key;
        switch (colorDiscriminator){
            case "Black":
                key = new BlackKey(keyDiscriminator);
                break;
            case "White":
                key = new WhiteKey(keyDiscriminator);
                break;
            default:
                System.out.println("error");
                return null;
        }
        key.addActionListener(listener);
        return key;
    }
}
