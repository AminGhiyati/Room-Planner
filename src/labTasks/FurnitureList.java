package labTasks;

import java.util.ArrayList;

public class FurnitureList extends ArrayList<Furniture> {

    public void shiftAllElements(int dx, int dy) {
        for (Furniture furniture : this) {
            furniture.setX(furniture.getX() + dx);
            furniture.setY(furniture.getY() + dy);
        }
    }
}
