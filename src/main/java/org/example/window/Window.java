package org.example.window;

import org.example.logic.Logic;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {


    private JSlider slider;

    private JComboBox jComboBox;


    public Window() throws HeadlessException {
        super("JURAJ BRILLA APP");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);

        Logic logic = new Logic();

        JPanel controlsPanel = new JPanel(new GridLayout(2,4));


        controlsPanel.add(returnSlider(logic));
        controlsPanel.add(returnButton(logic,"Butt1"));
        controlsPanel.add(returnButton(logic,"Butt2"));
        controlsPanel.add(returnButton(logic,"Butt3"));
        controlsPanel.add(returnComboBox(logic));
        controlsPanel.add(logic.getLabelFirst());
        controlsPanel.add(logic.getLabelSecond());
        controlsPanel.add(logic.getLabelThird());



        add(controlsPanel,BorderLayout.SOUTH);
        add(logic.getCanvas());

        addKeyListener(logic);
        addMouseListener(logic);
        addMouseMotionListener(logic);

        setFocusable(true);
        setVisible(true);

    }

    private JSlider returnSlider(Logic logic){
        slider = new JSlider(0,100,50);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setPaintLabels(true);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(25);

        slider.addChangeListener(logic);
        slider.setFocusable(false);

        return slider;
    }

    private JButton returnButton(Logic logic, String name){
        JButton butt = new JButton(name);
        butt.addActionListener(logic);
        butt.setFocusable(false);

        return butt;
    }

    private JComboBox returnComboBox(Logic logic){
        jComboBox = new JComboBox();

        jComboBox.addActionListener(logic);
        jComboBox.setFocusable(false);

        fillComboBoxx(jComboBox);

        return jComboBox;
    }

    private void fillComboBoxx(JComboBox comboBox){
        comboBox.addItem("Jozo");
        comboBox.addItem("FERO");
        comboBox.addItem("Jano");
    }
}
