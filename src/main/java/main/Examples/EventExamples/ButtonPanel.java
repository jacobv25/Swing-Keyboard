package main.Examples.EventExamples;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    JButton button;
    ActionListener textPanelListener;
    public ButtonPanel(){
        setLayout(new FlowLayout());

        button = new JButton("Press Me");

        add(button);


    }

    public void setTextPanelListener(ActionListener textPanelListener) {
        this.textPanelListener = textPanelListener;
    }

    public void init() {
        if(textPanelListener != null) {
            button.addActionListener(textPanelListener);
        }
    }
}
