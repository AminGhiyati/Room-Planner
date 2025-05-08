package labTasks;

import java.awt.*;

public class Chair implements Furniture {
    private int x;
    private int y;
    private Color color;

    public Chair(Color color) {
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
        graphic2d.drawLine(70 + x, 30 + y, 170 + x, 30 + y);
        graphic2d.drawLine(70 + x, 30 + y, 70 + x, 120 + y);
        graphic2d.drawLine(170 + x, 30 + y, 170 + x, 120 + y);
        graphic2d.drawLine(70 + x, 75 + y, 170 + x, 75 + y);
        graphic2d.drawLine(60 + x, 120 + y, 180 + x, 120 + y);
        graphic2d.drawLine(70 + x, 120 + y, 60 + x, 205 + y);
        graphic2d.drawLine(80 + x, 120 + y, 70 + x, 205 + y);
        graphic2d.drawLine(170 + x, 120 + y, 180 + x, 205 + y);
        graphic2d.drawLine(160 + x, 120 + y, 170 + x, 205 + y);
    }
}
