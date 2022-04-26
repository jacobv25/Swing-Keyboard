package main.Panels;

import main.Buttons.Keys.BlackKey;
import main.Buttons.Keys.KeyboardKey;
import main.Buttons.Keys.WhiteKey;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.event.ActionListener;

public class KeyboardPanel extends JPanel {
    KeyboardKey cKey;
    KeyboardKey cSharpKey;
    KeyboardKey dKey;
    KeyboardKey dSharpKey;

    ActionListener recordSheetPanel;

    public KeyboardPanel() throws MidiUnavailableException {

//        add(new WhiteKey("C"));
//        add(new BlackKey("C#"));
//        add(new WhiteKey("D"));
//        add(new BlackKey("D#"));
//        add(new WhiteKey("E"));
//        add(new WhiteKey("F"));
//        add(new BlackKey("F#"));
//        add(new WhiteKey("G"));
//        add(new BlackKey("G#"));
//        add(new WhiteKey("A"));
//        add(new BlackKey("A#"));
//        add(new WhiteKey("B"));
//        add(new WhiteKey("C6"));
    }

    public void init() throws MidiUnavailableException {
        cKey = new WhiteKey("C");
        cKey.addActionListener(recordSheetPanel);

        cSharpKey = new BlackKey("C#");
        cSharpKey.addActionListener(recordSheetPanel);

        dKey = new WhiteKey("D");
        dKey.addActionListener(recordSheetPanel);

        dSharpKey = new BlackKey("D#");
        dSharpKey.addActionListener(recordSheetPanel);

        add(cKey);
        add(cSharpKey);
        add(dKey);
        add(dSharpKey);
    }

    public void setRecordSheetPanel(ActionListener recordSheetPanel) {
        this.recordSheetPanel = recordSheetPanel;
    }
}
