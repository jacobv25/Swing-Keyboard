package Buttons.Keys;

import main.Buttons.Keys.BlackKey;
import main.Buttons.Keys.KeyboardKey;
import main.Buttons.Keys.WhiteKey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sound.midi.MidiUnavailableException;

public class KeyboardKeyTest {

    KeyboardKey whiteKey;
    KeyboardKey blackKey;

    @BeforeEach
    public void setUp() throws MidiUnavailableException {
        whiteKey = new WhiteKey("C");
        blackKey = new BlackKey("C#");
    }

    @Test
    public void testWhiteKeyPlayNote(){

    }
    @Test
    public void testBlackKeyPlayNote(){

    }

    @Test
    public void testWhiteKeyInstantiation(){
        Assertions.assertNotNull(whiteKey);
    }

    @Test
    public void testBlackKeyInstantiation(){
        Assertions.assertNotNull(whiteKey);
    }

}
