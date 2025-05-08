package labTasks;

import java.awt.*;

public class Desk implements Furniture {
    private int x;
    private int y;
    private Color color;

    public Desk(Color color) {
        this.color = color;
        this.x = 0;
        this.y = 0;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        if (x >= 0) this.x = x;
        else throw new IllegalArgumentException("X darf nicht negativ sein.");
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        if (y >= 0) this.y = y;
        else throw new IllegalArgumentException("Y darf nicht negativ sein.");
    }

    @Override
    public void paint(Graphics2D graphic2d) {
        graphic2d.setColor(color);
        graphic2d.drawLine(30 + x, 30 + y, 30 + x, 130 + y);
        graphic2d.drawLine(130 + x, 30 + y, 130 + x, 130 + y);
        graphic2d.drawLine(15 + x, 30 + y, 145 + x, 30 + y);
        graphic2d.drawLine(15 + x, 15 + y, 145 + x, 15 + y);
        graphic2d.drawLine(15 + x, 15 + y, 15 + x, 30 + y);
        graphic2d.drawLine(145 + x, 15 + y, 145 + x, 30 + y);
        graphic2d.drawLine(30 + x, 70 + y, 130 + x, 70 + y);
    }
}
