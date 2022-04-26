package main.Panels;

import main.Buttons.DMS_Button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyBoardButtonsPanel extends JPanel {

    DMS_Button record;
    DMS_Button play;

    public KeyBoardButtonsPanel(){
        record = new DMS_Button("Record");
        play = new DMS_Button("Play");
        add(record);
        add(play);
    }

    public void addActionListeners(ActionListener recordSheetListener){
        try{
            record.addActionListener(recordSheetListener);
            play.addActionListener(recordSheetListener);
        }catch(NullPointerException e) {
            e.printStackTrace();
        }
    }
}
