package userInterface;

import labTasks.Chair;
import labTasks.Desk;
import labTasks.Furniture;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import labTasks.FurnitureList;


public class PaintPanel extends JPanel {
    private static final long serialVersionUID = 1L;


    private FurnitureList myFurnitures;


    public PaintPanel() {
        myFurnitures = new FurnitureList();


        int numChairs = 2;
        int numDesks = 2;

        Random rand = new Random();

        for (int i = 0; i < numChairs; i++) {
            Chair chair = new Chair(Color.BLUE);
            chair.setX(rand.nextInt(551));
            chair.setY(rand.nextInt(451));
            myFurnitures.add(chair);
            // Boilerplate: Das Erstellen, Positionieren und Hinzufügen wiederholt sich.
            // Man könnte eine Hilfsmethode schreiben.

        }

        for (int i = 0; i < numDesks; i++) {
            Desk desk = new Desk(Color.RED);
            desk.setX(rand.nextInt(551));
            desk.setY(rand.nextInt(451));
            myFurnitures.add(desk);
            // Boilerplate: Das Erstellen, Positionieren und Hinzufügen wiederholt sich.
            // Man könnte eine Hilfsmethode schreiben.
        }
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g); //
        Graphics2D graphic2d = (Graphics2D) g;



        for (Furniture furniture : myFurnitures) {
            furniture.paint(graphic2d);
        }
    }

    public void shiftFurniture() {
        myFurnitures.shiftAllElements(10, 10);
    }


}
