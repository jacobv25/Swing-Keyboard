package main;

import javax.swing.*;

/**
 * This is a test class.
 * The purpose of this class is to test a working PianoRoll
 */
public class PianoRoll extends JFrame {

    JSlider slider;

    public PianoRoll(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        slider = new JSlider(0,100,0);
        add(slider);
        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new PianoRoll()
        );
    }
}
