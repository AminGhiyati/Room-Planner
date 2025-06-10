package labTasks;

import java.awt.*;

public class Chair extends AbstractFurniture {

    public Chair(Color color) {
        super(color);
        // Boilerplate: Dieser Konstruktor macht nichts anderes als den Wert weiterzugeben.
        // Wiederholt sich in jeder Klasse.
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

    @Override
    public Dimension getSize() {
        return new Dimension(150, 150);
    }


}
