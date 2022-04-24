package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is a test class.
 * The purpose of this class is to test a working PianoRoll
 */
public class PianoRoll extends JFrame {

    Thread thread;
    JSlider slider;
    private long delay = 200;
    int i;

    public PianoRoll() throws InterruptedException {
//        i=0;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 16));
        slider = new JSlider(0, 100, 0);
        add(slider);
        pack();
        setVisible(true);
        JButton startButton = new JButton("play");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                slider.setValue(0);
                // Runs outside of the Swing UI thread
                new Thread(new Runnable() {
                    public void run() {
                        while(true){
                            // Runs inside of the Swing UI thread
                            SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    if (slider.getValue() < slider.getMaximum()) {
                                        slider.setValue(slider.getValue() + 1);
                                    } else {
                                        slider.setValue(0);
                                    }
                                }
                            });

                            try {
                                java.lang.Thread.sleep(100);
                            }
                            catch(Exception e) { }
                        }
                    }
                }).start();
            }
        });
        add(startButton);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()-> {
                    try {
                        new PianoRoll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
