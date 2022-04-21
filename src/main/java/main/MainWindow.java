package main;

import main.Panels.KeyboardPanel;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() throws MidiUnavailableException {
//        setSize(1000,800);
//        realtimePlayer = new RealtimePlayer();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new KeyboardPanel());
        setVisible(true);
        pack();
    }

    public static void main(String[] args) throws MidiUnavailableException {
//        SwingUtilities.invokeLater(
//                () -> {
//                    try {
//                        new MainWindow();
//                    } catch (MidiUnavailableException e) {
//                        e.printStackTrace();
//                    }
//                }
//        );
        new MainWindow();
    }
}
