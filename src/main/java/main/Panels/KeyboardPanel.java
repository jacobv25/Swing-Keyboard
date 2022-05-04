package main.Panels;

import main.Buttons.Keys.KeyboardKey;
import main.Factories.KeyboardKeyFactory;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.event.ActionListener;

public class KeyboardPanel extends JPanel {

    private ActionListener recordSheetPanel;

    private String[] keys = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C6"};

    public KeyboardPanel() {}

    public void init() throws MidiUnavailableException {
        KeyboardKeyFactory factory = new KeyboardKeyFactory();
        KeyboardKey keyObj;
        String keyStr, color;
        for(int i = 0; i < keys.length; i++){
            keyStr = keys[i];
            if(keyStr.endsWith("#")){
                color = "Black";
            }
            else { color = "White"; }
            keyObj = factory.createKeyboardKey(color, keyStr, recordSheetPanel  );
            add(keyObj);
        }
    }

    public void addActionListener(ActionListener recordSheetPanel) {
        this.recordSheetPanel = recordSheetPanel;
    }
}
