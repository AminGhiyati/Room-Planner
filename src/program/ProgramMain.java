package program;

import userInterface.PaintPanel;

import javax.swing.*;
import java.awt.*;

public class ProgramMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Architects Shape Setter");

        JPanel mainPanel = new JPanel(new BorderLayout());

        PaintPanel paintPanel = new PaintPanel();
        mainPanel.add(paintPanel, BorderLayout.CENTER);


        JButton shiftButton = new JButton("Verschieben");
        shiftButton.addActionListener(e -> {
            paintPanel.shiftFurniture();
            paintPanel.repaint();
        });

        mainPanel.add(shiftButton, BorderLayout.SOUTH);


        frame.setContentPane(mainPanel);
        frame.setSize(720, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
