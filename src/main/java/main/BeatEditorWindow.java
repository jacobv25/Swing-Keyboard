package main;

import main.Panels.BeatEditorButtonsPanel;

import javax.swing.*;
import java.awt.*;
import java.net.NoRouteToHostException;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;

public class BeatEditorWindow extends JFrame {
    public BeatEditorWindow(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new BeatEditorButtonsPanel(), NORTH);
        add(new BeatEditor(), CENTER);
        pack();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()-> new BeatEditorWindow()
        );
    }
}
