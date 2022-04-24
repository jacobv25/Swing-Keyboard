package main.BeatEditor;

import javax.swing.*;
import java.awt.*;

public class BeatEditor extends JPanel {

    public BeatEditor(){
        setLayout(new GridLayout(4, 1));
        add(new Beat("Hi Hat", 16));
        add(new Beat("Lo Hat", 16));
        add(new Beat("Synth3", 16));
        add(new Beat("Bass 1", 16));

        setVisible(true);
    }

}
