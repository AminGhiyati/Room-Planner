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
        chair.paintChair(graphic2d);

        Desk desk = new Desk();
        desk.paintDesk(graphic2d);
    }

}