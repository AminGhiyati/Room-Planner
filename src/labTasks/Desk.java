package labTasks;

import java.awt.*;

public class Desk extends AbstractFurniture {

    public Desk(Color color) {
        super(color);
        // Boilerplate: Genau wie bei Chair.
        // Kann man sich sparen, wenn nichts anderes im Konstruktor steht.
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

    @Override
    public Dimension getSize() {
        return new Dimension(150, 150);
    }
}
