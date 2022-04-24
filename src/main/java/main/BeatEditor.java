package main;

import main.Panels.BeatEditorButtonsPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeatEditor extends JPanel {

    public BeatEditor(){
        setLayout(new GridLayout(4, 16));
        for(int i=0; i<64; i++){
            add(new JButton());
        }
        setVisible(true);
    }

}
