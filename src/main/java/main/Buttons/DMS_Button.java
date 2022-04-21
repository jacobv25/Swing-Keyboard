package main.Buttons;

import javax.swing.*;
import java.awt.*;

import static javax.swing.border.BevelBorder.RAISED;

public class DMS_Button extends JButton {
    public DMS_Button(String text){
        setBackground(new Color(102,102,102));
        setFont(new Font(".AppleSystemUIFont",0,13));
        setForeground(new Color(102, 250, 250));
        setHorizontalAlignment(CENTER);
        setText(text);
        setBorder(BorderFactory.createBevelBorder(
                RAISED,
                null,
                new Color(102, 102, 102),
                null,
                null));
    }
}
