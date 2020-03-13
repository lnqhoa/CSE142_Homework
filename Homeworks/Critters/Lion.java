// This file represents the Lion critter,
// displaying in the game with "L,
// with the color Red, Blue or Green

import java.awt.*;

public class Lion extends Critter {

   private int steps;
   
   public Lion() {
      this.steps = 0;
   }
      
   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
         return Action.LEFT;
      } else if (info.getFront() == Neighbor.SAME) {
         return Action.RIGHT;
      } else {
         return Action.HOP;
      }
   }
     
   public Color randomize() {
     double num = Math.random();
     double athird = 1.0 / 3.0;
     if (num <= athird) {
      return Color.RED; 
     } else if (athird * 2 <= num) {
      return Color.GREEN;
     } else {
      return Color.BLUE;
     } 
   }
   
   public Color getColor() {
      this.steps = this.steps++;
      if ((this.steps - 1) % 3 == 0) {
         Color random = randomize(); 
         return random;
      } else {
         Color random = randomize(); 
         return random; 
      }
   }
   
   public String toString() {
       return "L";
   }

}