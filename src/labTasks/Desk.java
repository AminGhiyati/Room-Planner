package labTasks;

import java.awt.*;

public class Desk {

    public void paintDesk(Graphics2D graphic2d) {
        graphic2d.setColor(Color.RED);
        int x = 1;
        int y= 1;

        //beine
        graphic2d.drawLine(30+x, 30+y, 30+x, 130+y);
        graphic2d.drawLine(130+x, 30+y, 130*x, 130+y);

        //oben
        graphic2d.drawLine(15+x, 30+y, 145+x, 30+y);
        graphic2d.drawLine(15+x, 15+y, 145+x, 15+y);

        //seiten oben
        graphic2d.drawLine(15+x, 15+y, 15+x, 30+y);
        graphic2d.drawLine(145+x, 15+y, 145+x, 30+y);

        //mitte
        graphic2d.drawLine(30+x, 70+y, 130+x, 70+y);


    }

}