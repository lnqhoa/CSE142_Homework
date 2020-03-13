// This file represents the Giant critter,
// displaying in the game with "fee", "fie", "foe" and "fum",
// with the color Gray

import java.awt.*;

public class Giant extends Critter {
   
   private int steps;
   
   public Giant() {
      this.steps = 0;
   }
     
   public Action getMove (CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() != Neighbor.OTHER) {
         return Action.HOP;
      } else {
         return Action.RIGHT;
      }
   }
   
   public Color getColor() {
      return Color.GRAY;
   }

   public void countStep() {
      if (this.steps == 23) {
         this.steps = 0;
      } else {
         this.steps++;
      }
   }

   public String toString() {
      if (this.steps <= 5) {
         return "fee";
      } else if (5 < this.steps && this.steps <= 11) {
         return "fie";
      } else if (11 < this.steps && this.steps <= 17) {
         return "foe";
      } else {
         return "fum";
      }
   }

}