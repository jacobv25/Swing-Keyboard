package main.Panels;

import main.BeatEditor;
import main.Buttons.DMS_Button;

import javax.swing.*;
import java.awt.*;

public class BeatEditorButtonsPanel extends JPanel {
    DMS_Button play;
    DMS_Button stop;
    DMS_Button addBeat;

    public BeatEditorButtonsPanel(){
        play = new DMS_Button("Play");
        stop = new DMS_Button("Stop");
        addBeat = new DMS_Button("Add Beat");
        setLayout(new FlowLayout());
        add(play);
        add(stop);
        add(addBeat);
    }
}
