package main.Examples.EventExamples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextPanel extends JPanel implements ActionListener {
    JLabel label;
    int counter;
    public TextPanel(){
        setLayout(new FlowLayout());
        label = new JLabel("I am not pressed yet");
        counter=0;
        add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("button was pressed" + counter + " times!");
    }
}
