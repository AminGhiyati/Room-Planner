package labTasks;

import java.awt.*;

public class Desk {
    private int x;
    private int y;

    public Desk() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("X darf nicht negativ sein.");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("Y darf nicht negativ sein.");
        }
    }

    public void paintDesk(Graphics2D graphic2d) {
        graphic2d.setColor(Color.RED);

        //beine
        graphic2d.drawLine(30 + x, 30 + y, 30 + x, 130 + y);
        graphic2d.drawLine(130 + x, 30 + y, 130 + x, 130 + y);

        //oben
        graphic2d.drawLine(15 + x, 30 + y, 145 + x, 30 + y);
        graphic2d.drawLine(15 + x, 15 + y, 145 + x, 15 + y);

        //seiten oben
        graphic2d.drawLine(15 + x, 15 + y, 15 + x, 30 + y);
        graphic2d.drawLine(145 + x, 15 + y, 145 + x, 30 + y);

        //mitte
        graphic2d.drawLine(30 + x, 70 + y, 130 + x, 70 + y);
    }
}
