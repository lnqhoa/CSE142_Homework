// This file represents the Huskey critter,
// displaying in the game with "H"
// with the color Black

import java.awt.*;

public class Husky extends Critter {

    public Action getMove (CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getBack() == Neighbor.OTHER) {
         return Action.LEFT;
      } else if (info.getFront() == Neighbor.WALL) {
         return Action.RIGHT;
      } else {
         return Action.HOP;
      }
    }
    
    public Color getColor() {
      return Color.BLACK;
    }
    
    public String toString() {
      return "H";
    }
}