package main;

import main.Panels.KeyBoardButtonsPanel;
import main.Panels.KeyboardPanel;
import main.Panels.NoteRecordSheetPanel;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.*;

public class MainWindow extends JFrame {

    KeyboardPanel keyboardPanel;
    KeyBoardButtonsPanel keyBoardButtonsPanel;
    NoteRecordSheetPanel noteRecordSheetPanel;

    public MainWindow() throws MidiUnavailableException {
        noteRecordSheetPanel = new NoteRecordSheetPanel();
        keyboardPanel = new KeyboardPanel();
        keyBoardButtonsPanel = new KeyBoardButtonsPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(keyboardPanel, SOUTH);
        add(keyBoardButtonsPanel, CENTER);
        add(noteRecordSheetPanel, NORTH);
        keyBoardButtonsPanel.addActionListeners(noteRecordSheetPanel);
        keyboardPanel.setRecordSheetPanel(noteRecordSheetPanel);
        keyboardPanel.init();
        setVisible(true);
        pack();
    }

    public static void main(String[] args) throws MidiUnavailableException {
        SwingUtilities.invokeLater(
                () -> {
                    try {
                        new MainWindow();
                    } catch (MidiUnavailableException e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
