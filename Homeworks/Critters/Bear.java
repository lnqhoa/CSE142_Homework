// This file represents the Bear critter,
// displaying in the game with "/" and "\"
// with the color Black and White

import java.awt.*;

public class Bear extends Critter {
   
   private boolean color;
   private int steps;
   
   public Bear (boolean color) {
      this.color = color;
      this.steps = 0; 
   }
      
   public Action getMove (CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      } else {
         return Action.LEFT;
      }
   }
   
   public Color getColor() {
      if (color = false) {
         return Color.BLACK;
      } else {
         return Color.WHITE;
      }
   }
   
   public String toString() {
      this.steps++;
      if (this.steps % 2 == 1) {
         return "/";
      } else {
         return "\\";
      }
   }
}