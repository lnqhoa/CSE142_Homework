// Wednesday 01.22.2020
// Parameters and Drawing

import java.awt.*;

public class Drawing {
   public static void main(String []args) {
      DrawingPanel panel = new DrawingPanel(400, 200);
      panel.setBackground(Color.LIGHT_GRAY);
      Graphics pen = panel.getGraphics();
      
      drawVan1(pen); // Have to provide the parameter that is expected --> the name brush doesn't need to be the same like in the method. 
      drawVan2(pen, 150, 10);
      drawVan2(pen, 10, 130);
   }
   
   // Variable cannot include method unless the scope includes it (parameter?)
   public static void drawVan1(Graphics brush) { //Specifying the variable to take in brush
      brush.fillRect(10, 30, 100, 50); // (x, y (location), length, height)
      
      brush.setColor(Color.CYAN);
      brush.fillRect(80, 40, 30, 20);
      
      brush.setColor(Color.RED);
      brush.fillOval(20, 70, 20, 20); // (x, y (rectangle that can cover the oval), height, height)
      brush.fillOval(80, 70, 20, 20);
   }
   
      // Passing in parameters so you can draw multiple without re-drawing and just sub in new coordinates
      public static void drawVan2(Graphics brush, int x, int y) {
         brush.setColor(Color.BLACK);
         brush.fillRect(x, y, 100, 50); 
      
         brush.setColor(Color.CYAN);
         brush.fillRect(x + 70, y + 10, 30, 20);
      
         brush.setColor(Color.RED);
         brush.fillOval(x + 10, y + 40, 20, 20);
         brush.fillOval(x + 70, y + 40, 20, 20);
   }
   
   public static void testing(Graphics g) {
         // Draw White box
         g.setColor(Color.WHITE);
         g.fillRect(x + size, y, size, size);
         // Draw the Blue lines
         g.setColor(Color.BLUE);
         g.drawLine(x, y, x + size, y + size);
         g.drawLine(x + size, y, x, y + size);
   }
   
}