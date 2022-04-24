package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeatEditor extends JFrame {

    Thread thread;
    JSlider slider;
    private long delay = 200;
    int i;

    public BeatEditor(){
//        i=0;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 16));
        for(int i=0; i<64; i++){
//            add(new JButton(String.valueOf(i)));
            add(new JButton());
        }
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()-> new BeatEditor()
        );
    }

}
