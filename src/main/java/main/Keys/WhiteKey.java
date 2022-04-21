package main.Keys;

import javax.sound.midi.MidiUnavailableException;
import java.awt.*;

public class WhiteKey extends KeyboardKey{
    public WhiteKey(String key) throws MidiUnavailableException {
        super(key);
        setBackground(Color.WHITE);
    }
}
