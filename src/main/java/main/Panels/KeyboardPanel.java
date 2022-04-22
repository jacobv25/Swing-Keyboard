package main.Panels;

import main.Keys.BlackKey;
import main.Keys.WhiteKey;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;

public class KeyboardPanel extends JPanel {
    WhiteKey cKey;
    BlackKey cSharpKey;
    WhiteKey dKey;
    BlackKey dSharpKey;

    NoteRecordSheetPanel recordSheetPanel;

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
        cKey.setRecordSheet(recordSheetPanel);

        cSharpKey = new BlackKey("C#");
        cSharpKey.setRecordSheet(recordSheetPanel);

        dKey = new WhiteKey("D");
        dKey.setRecordSheet(recordSheetPanel);

        dSharpKey = new BlackKey("D#");
        dSharpKey.setRecordSheet(recordSheetPanel);

        add(cKey);
        add(cSharpKey);
        add(dKey);
        add(dSharpKey);
    }

    public void setRecordSheetPanel(NoteRecordSheetPanel recordSheetPanel) {
        this.recordSheetPanel = recordSheetPanel;
    }
}
