import java.util.*;
import java.io.*;

public class testing_second {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner (new File("brownfox.txt"));
      
      String a = "0123456";
      String b = a.substring(0, 7);
      System.out.println(b);
   }
}