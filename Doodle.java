// Hoa N Le
// WIN 2020/01/22
// CSE 142
// TA: Jun Song
// Assignment #1
//
// This program helps practicing for loops, getting used to scope/parameter and drawing using Java.

import java.awt.*;

public class Doodle {
   public static void main(String[]args) {
      DrawingPanel panel = new DrawingPanel(230, 200);
      panel.setBackground(Color.WHITE);
      Graphics g = panel.getGraphics();
      Polygon p = new Polygon();
      ears(g);
      face(g);
   }
   
   // Drawing two cat's ears
   public static void ears(Graphics g) {
      g.fillPolygon(new int[] {80, 65, 95}, new int[] {35, 70, 70}, 3);
      g.fillPolygon(new int[] {150, 135, 165}, new int[] {35, 70, 70}, 3);
   }
   
   // Drawing cat's face
   public static void face(Graphics g) {
      // Top of face
      g.fillPolygon(new int[] {65, 95, 105, 55}, new int[] {72, 72, 95, 95}, 4);
      g.fillPolygon(new int[] {135, 165, 175, 125 }, new int[] {72, 72, 95, 95}, 4);
      g.fillPolygon(new int[] {97, 133, 123, 107}, new int[] {72, 72, 95, 95}, 4);
      // Mid of face
      g.fillRect(55, 97, 50, 28);
      g.fillRect(107, 97, 16, 28);
      g.fillRect(125, 97, 50, 28);
      // Bottom of Face
      g.fillPolygon(new int[] {55, 105, 80}, new int[] {127, 127, 155}, 3);
      g.fillPolygon(new int[] {125, 175, 150}, new int[] {127, 127, 155}, 3);
      g.fillPolygon(new int[] {107, 123, 148, 82}, new int[] {127, 127, 155, 155}, 4);
   }
   
}