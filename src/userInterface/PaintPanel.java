package userInterface;

import labTasks.Chair;
import labTasks.Desk;

import javax.swing.*;
import java.awt.*;

public class PaintPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphic2d = (Graphics2D) g;


        Desk desk = new Desk(Color.RED);
        desk.setX(240);
        desk.setY(270);

        Chair chair1 = new Chair(Color.BLUE);
        chair1.setX(50);
        chair1.setY(200);

        Chair chair2 = new Chair(Color.BLUE);
        chair2.setX(350);
        chair2.setY(200);


        desk.paintDesk(graphic2d);
        chair1.paintChair(graphic2d);
        chair2.paintChair(graphic2d);

    }
}
