// Hoa N Le
// WIN 2020/01/22
// CSE 142
// TA: Jun Song
// Assignment #1
//
// This program helps practicing for loops, getting used to scope/parameter and drawing using Java.

import java.awt.*;

public class CafeWall {
   
   public static final int MORTAR = 2;
   
   public static void main(String[]args) {
   
      DrawingPanel panel = new DrawingPanel(650, 400);
      panel.setBackground(Color.GRAY);
      Graphics g = panel.getGraphics();
      
      // Row A
      boxpair(g, 0, 0, 20, 4); 
      // Row B
      boxpair(g, 50, 70, 30, 5); 
      // Row C
      grid(g, 400, 20, 35, 2, 35); 
      // Row D
      grid(g, 10, 150, 25, 4, 0); 
      // Row E
      grid(g, 250, 200, 25, 3, 10); 
      // Row F
      grid(g, 425, 180, 20, 5, 10);                 
   }
   
   // This method creates a customizable # pair of black and white boxes with blue lines
   public static void boxpair(Graphics g, int x, int y, int size, int pair) {     
      for (int i = 1; i <= pair; i ++) {
         // Draw Black boxes
         g.setColor(Color.BLACK);
         g.fillRect(x + 2 * size * (i - 1), y, size, size);
         // Draw White boxes
         g.setColor(Color.WHITE);
         g.fillRect(x + 2 * size * i - size, y, size, size);
         // Draw Blue lines
         g.setColor(Color.BLUE);
         g.drawLine(x + 2 * size * (i - 1), y, x + 2 * size * (i - 1) + size, y + size);
         g.drawLine(x + 2 * size * (i - 1) + size, y, x + 2 * size * (i - 1), y + size);
      }
   }
   
   // This method creates a customizable pair of black and white boxes with blue lines and zigzaging
   public static void grid(Graphics g, int x, int y, int size, int pair, int o) {
      for (int i = 1; i <= 2 * pair; i++) {
         boxpair(g, x + ((i - 1) % 2) * o, y + i * size - size + (i - 1) * MORTAR, size, pair);
      }
   }
   
}