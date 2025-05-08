package labTasks;

import java.awt.Graphics2D;

public interface Furniture {
    int getX();
    void setX(int x);
    int getY();
    void setY(int y);
    void paint(Graphics2D g2d);
}
