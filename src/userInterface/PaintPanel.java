package userInterface;

import labTasks.Chair;
import labTasks.Desk;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class PaintPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private ArrayList<Chair> chairList;
    private ArrayList<Desk> deskList;

    public PaintPanel() {
        chairList = new ArrayList<>();
        deskList = new ArrayList<>();

        int numChairs = 2;
        int numDesks = 2;

        Random rand = new Random();


        for (int i = 0; i < numChairs; i++) {
            Chair chair = new Chair(Color.BLUE);
            chair.setX(rand.nextInt(551)); // 0 bis 550
            chair.setY(rand.nextInt(451)); // 0 bis 450
            chairList.add(chair);
        }


        for (int i = 0; i < numDesks; i++) {
            Desk desk = new Desk(Color.RED);
            desk.setX(rand.nextInt(551));
            desk.setY(rand.nextInt(451));
            deskList.add(desk);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;


        for (Chair c : chairList) {
            c.paintChair(g2d);
        }


        for (Desk d : deskList) {
            d.paintDesk(g2d);
        }
    }
}
