package main.Keys;

import javax.sound.midi.MidiUnavailableException;
import java.awt.*;

public class BlackKey extends KeyboardKey{

    public BlackKey(String key) throws MidiUnavailableException {
        super(key);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
    }
}
