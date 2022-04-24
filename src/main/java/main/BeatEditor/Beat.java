package main.BeatEditor;

import javax.swing.*;
import java.awt.*;

public class Beat extends JPanel {

    JLabel name;
    Step[] steps;
    int numSteps;

    public Beat(String _name, int n){
        setLayout(new FlowLayout());
        name = new JLabel(_name);
        add(name);
        initSteps(n);
    }

    private void initSteps(int n) {
        numSteps = n;
        steps = new Step[numSteps];
        for (int i=0; i<numSteps; i++){
            steps[i] = new Step();
            add(steps[i]);
        }
    }
}
