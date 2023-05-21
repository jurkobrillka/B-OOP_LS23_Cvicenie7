package org.example.objects;

import java.awt.*;

public class MyObject {

    private int startX;

    private int startY;


    public MyObject(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
    }

    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(startX,startY, 50, 2*50/3);
        g.fillRect(startX+50/3, startY+50/3, 50/3, 2*50/3);
    }
}
