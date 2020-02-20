import java.awt.*;
import java.util.*;

public class Testing {
   public static void main(String[]args) {
      // 01.23.2020     
      //DrawingPanel panel = new DrawingPanel(600, 200);  
      //panel.setBackground(Color.YELLOW);
      //Graphics g = panel.getGraphics();
      
      // 01.30.2020
      Scanner input = new Scanner(System.in);
      // PROBLEM 7
      //System.out.print("X coordinate? ");
      //double x = input.nextDouble();
      //System.out.print("Y coordinate? ");
      //double y = input.nextDouble();
      //quadrant(x, y);
      
   }
   
   //PROBLEM 5A + B - 01.23.2020
   public static void drawSquareA(Graphics g, int x, int y) {
      g.setColor(Color.RED);
      //g.drawRect(50, 50, 100, 100);
      for (int i = 1; i <= 5; i++) {
         g.drawRect(x, y, 20 * i, 20 * i);
      }
      g.setColor(Color.BLACK);
      g.drawLine(x, y, x + 100, y + 100);
   }
   //PROBLEM 5C - 01.23.2020
   public static void drawSquareB(Graphics g, int x, int y, int size) {
      g.setColor(Color.RED);
      //g.drawRect(50, 50, 100, 100);
      for (int i = 1; i <= 5; i++) {
         g.drawRect(x, y, size * i, size * i);
      }
      g.setColor(Color.BLACK);
      g.drawLine(x, y, x + size * 5, y + size * 5);
   }
   //PROBLEM 6 - 01.23.2020
   public static void triangle(Graphics g) {
      g.setColor(Color.BLUE);
      g.drawLine(0, 0, 300, 200);
      g.drawLine(600, 0, 300, 200);
      //for (int i = 1; i <= ; i++) {
                  
    }
   
   // PROBLEM 7 - 01.30.2020
   public static int quadrant(double x, double y) {
      if (x > 0 && y > 0) {
         return 1;
      } else if (x > 0 && y > 0) {
         return 2; 
      } else if (x < 0 && y < 0) {
         return 3;
      } else if ( x > 0 && y < 0) {
         return 4;
      } else {
         return 0;
      }
   }
   
}
   


// HW #4 Budgeter

public static double results() {
      if (totalIncome > totalExpense) {
         System.out.println("You earned $___ more than you spent this month.");
         System.out.println("You're a big saver.");
      } else if (totalIncome < totalExpense) {
         System.out.println("You're a big saver.");
         System.out.println("You're a big saver.");
      } else {
      
      }
      System.out.println("Thank you for using my application!");
   }