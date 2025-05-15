package labTasks;

import java.awt.*;

public abstract class AbstractFurniture implements Furniture {
    protected int x;
    protected int y;
    protected Color color;

    public AbstractFurniture(Color color) {
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
    public abstract void paint(Graphics2D g2d);
}
