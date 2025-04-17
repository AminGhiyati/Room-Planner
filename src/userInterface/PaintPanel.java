package userInterface;

import labTasks.Chair;
import labTasks.Desk;

import javax.swing.*;
import java.awt.*;

public class PaintPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    @Override
    public void paint(Graphics g) {
        Graphics2D graphic2d =  (Graphics2D) g;

        Chair chair = new Chair();
        chair.setX(100);
        chair.setY(200);
        chair.paintChair(graphic2d);

        Desk desk = new Desk();
        desk.setX(100);
        desk.setY(200);
        desk.paintDesk(graphic2d);
    }

}

