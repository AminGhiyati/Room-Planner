package userInterface;

import labTasks.Chair;
import labTasks.Desk;
import labTasks.Furniture;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class PaintPanel extends JPanel {
    private static final long serialVersionUID = 1L;


    private ArrayList<Furniture> myFurnitures;

    public PaintPanel() {
        myFurnitures = new ArrayList<>();

        int numChairs = 2;
        int numDesks = 2;

        Random rand = new Random();

        for (int i = 0; i < numChairs; i++) {
            Chair chair = new Chair(Color.BLUE);
            chair.setX(rand.nextInt(551));
            chair.setY(rand.nextInt(451));
            myFurnitures.add(chair);
        }

        for (int i = 0; i < numDesks; i++) {
            Desk desk = new Desk(Color.RED);
            desk.setX(rand.nextInt(551));
            desk.setY(rand.nextInt(451));
            myFurnitures.add(desk);
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphic2d = (Graphics2D) g;

        for (Furniture furniture : myFurnitures) {
            furniture.paint(graphic2d);
        }
    }
}
