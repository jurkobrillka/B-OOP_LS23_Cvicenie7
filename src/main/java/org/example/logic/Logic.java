package org.example.logic;

import org.example.objects.MyObject;
import org.example.window.Canvas;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class Logic extends UniversalAdapter{


    JLabel labelFirst;

    JLabel labelSecond;

    JLabel labelThird;

    private org.example.window.Canvas canvas;


    public Canvas getCanvas() {
        return canvas;
    }

    public JLabel getLabelThird() {
        return labelThird;
    }

    public JLabel getLabelFirst() {
        return labelFirst;
    }

    public JLabel getLabelSecond() {
        return labelSecond;
    }

    public Logic() {
        labelFirst = new JLabel("First");
        labelSecond = new JLabel("Second");
        labelThird = new JLabel("Third");

        canvas = new org.example.window.Canvas();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        if (e.getActionCommand().equals("Butt1")){
            System.out.println("Stlaceny butt1");
        } else if (e.getActionCommand().equals("Butt2")) {
            System.out.println("Stlaceny butt2");
        }
        else if(e.getActionCommand().equals("Butt3")){
            System.out.println("Stlaceny butt3");
        } else if (e.getSource() instanceof JComboBox) {
            String valueComboBox = String.valueOf(((JComboBox) e.getSource()).getSelectedIndex());
            System.out.println("ComboBox changed value: "+valueComboBox);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                System.out.println("Stlaceny UP");
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("Stlaceny DOWN");
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("Stlaceny right");
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("Stlaceny left");
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        System.out.println("Mouse clicked");
        System.out.println("Suradnice: ["+e.getX()+"]["+e.getY()+"]");

        MyObject tempMyObject = new MyObject(e.getX(),e.getY());
        canvas.getMyObjectList().add(tempMyObject);
        canvas.repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
        System.out.println("Mouse dragged");
        System.out.println("Suradnice: ["+e.getX()+"]["+e.getY()+"]");

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        super.stateChanged(e);
        int sliderValue = ((JSlider) e.getSource()).getValue();
        System.out.println("Slider value: "+sliderValue);
    }




}
