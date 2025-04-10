package labTasks;

import java.awt.*;

public class Chair {

    public void paintChair(Graphics2D graphic2d) {
        graphic2d.setColor(Color.BLUE);

        int x =1;
        int y= 200;

        //oben
        graphic2d.drawLine(70+x, 30+y, 170+x, 30+y);
        //beine
        graphic2d.drawLine(70+x, 30+y, 70+x, 120+y);
        graphic2d.drawLine(170+x, 30+y, 170+x, 120+y);
        //mitte
        graphic2d.drawLine(70+x, 75+y, 170+x, 75+y);
        //unten
        graphic2d.drawLine(60+x, 120+y, 180+x, 120+y);
        //beine links
        graphic2d.drawLine(70+x, 120+y, 60+x, 205+y);
        graphic2d.drawLine(80+x, 120+y, 70+x, 205+y);
        //beine rechts
        graphic2d.drawLine(170+x, 120+y, 180+x, 205+y);
        graphic2d.drawLine(160+x, 120+y, 170+x, 205+y);




    }
}