package main.Menus;

import javax.swing.*;
import java.awt.event.ItemListener;

public class ChooseInstrumentMenu extends JMenu {
    private ButtonGroup buttonGroup;
    private JRadioButtonMenuItem pianoRadioButtonMenuItem;
    private JRadioButtonMenuItem fluteRadioButtonMenuItem;
    private JRadioButtonMenuItem guitarRadioButtonMenuItem;
    private ItemListener[] itemListeners;

    public ChooseInstrumentMenu(){

        setText("Choose Instrument");
        buttonGroup = new ButtonGroup();

        pianoRadioButtonMenuItem = new JRadioButtonMenuItem("Piano");
        pianoRadioButtonMenuItem.setSelected(true);
        buttonGroup.add(pianoRadioButtonMenuItem);
        add(pianoRadioButtonMenuItem);

        fluteRadioButtonMenuItem = new JRadioButtonMenuItem("Flute");
        buttonGroup.add(fluteRadioButtonMenuItem);
        add(fluteRadioButtonMenuItem);

        guitarRadioButtonMenuItem = new JRadioButtonMenuItem("Guitar");
        add(guitarRadioButtonMenuItem);
        buttonGroup.add(guitarRadioButtonMenuItem);
        add(guitarRadioButtonMenuItem);
    }

    public void setItemListeners(ItemListener[] actionListeners) {
        this.itemListeners = actionListeners;
        addItemListeners();
    }

    private void addItemListeners(){
        for (int i = 0; i< itemListeners.length; i++) {
            pianoRadioButtonMenuItem.addItemListener(itemListeners[i]);
            fluteRadioButtonMenuItem.addItemListener(itemListeners[i]);
            guitarRadioButtonMenuItem.addItemListener(itemListeners[i]);
        }
}
}
