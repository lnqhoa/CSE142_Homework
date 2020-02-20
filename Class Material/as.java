import java.util.*;

public class as {
   public static void main(String[]args) {
      Random r = new Random();
      Scanner console = new Scanner(System.in);
      
      Ant(r);
      
   }  
   
   public static void Ant1 (Random r) {
       int fall = 0;
       int target = 6;
       int prev = r.nextInt(7);
       int step = prev;
       System.out.print("Steps: " + step);
       while (step < target) {
         step = r.nextInt(7);
         System.out.print(", " + step);
         if (prev > step) {
           fall++;
         }
         prev = step;
      }
      System.out.println();
      System.out.println("number of falls: " + fall);
   }
   
}