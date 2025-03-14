package labTasks;

import java.awt.*;

public class Chair {

    public void paintChair(Graphics2D graphic2d) {
        graphic2d.setColor(Color.LIGHT_GRAY);
        graphic2d.drawLine(20, 13, 145, 78);
        graphic2d.fillRect(100, 50, 60, 80);
    }
}