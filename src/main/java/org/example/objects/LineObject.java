package org.example.objects;

import java.awt.*;

public class LineObject {

    private int x;

    private int y;

    private int angle;

    private int length;

    public LineObject(int x, int y, int angle, int length) {
        this.x = x;
        this.y = y;
        this.angle = angle;
        this.length = length;
    }

    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.drawLine(x,y, (int) (x + Math.cos(Math.toRadians(angle)) * length), (int) (y + Math.sin(Math.toRadians(angle)) * length)); //trigoniometria
    }
}
