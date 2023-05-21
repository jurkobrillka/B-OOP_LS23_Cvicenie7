package org.example.window;

import org.example.objects.LineObject;
import org.example.objects.MyObject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JPanel {

    private List<MyObject> myObjectList;

    private List<LineObject> linesObjectList;

    public List<MyObject> getMyObjectList() {
        return myObjectList;
    }
    public List<LineObject> getLinesObjectList() {
        return linesObjectList;
    }

    public Canvas() {
        super();
        myObjectList = new ArrayList<>();
        linesObjectList = new ArrayList<>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (LineObject line:linesObjectList){
            line.draw(g);
        }

        for (MyObject myObject:myObjectList){
            myObject.draw(g);
        }
    }
}
