package main.Examples.EventExamples;

import main.MainWindow;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.EAST;

public class MainFrame extends JFrame {

    ButtonPanel buttonPanel;
    TextPanel textPanel;

    public MainFrame(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        //important stuff goes below

        buttonPanel = new ButtonPanel();
        textPanel = new TextPanel();
        buttonPanel.setTextPanelListener(textPanel);
        buttonPanel.init();

        add(buttonPanel, EAST);
        add(textPanel, BorderLayout.WEST);

        //
        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> {
                    new MainFrame();
                }
        );
    }
}
