import java.util.*;

public class practiceIt_1 {
   public static void main(String[]args) {
      Scanner console = new Scanner(System.in);
      Random r = new Random();

mystery(7,5);		
mystery(20,4);		
mystery(40,10);		
//mystery(0);	
   }
   
   public static void mystery(int x, int y) {
    while (x > 0 && y > 0) {
        x = x - y;
        y--;
        System.out.print(x + " ");
    }
    System.out.println(y);
}  
   // https://practiceit.cs.washington.edu/problem/view/bjp3/chapter3/s17-countQuarters
   // Chapter 3 - Problem 17 Count Quarters
   public static int countQuarters (int cent) {
      int num = 0;
      if (cent > 99) {
         num = (cent / 25) % 4;
         
      } else {
         num = cent / 25;
      }
      System.out.println(num);
      return num;
   }
   
   // https://practiceit.cs.washington.edu/problem/view/bjp3/chapter3/e7-largestAbsVal
   // Chapter 3 - Problem 7 - Largest Absolute Values
   public static int largestAbsVal(int x, int y, int z) {
      int max = 0;
      x = Math.abs(x);
      y = Math.abs(y);
      z = Math.abs(z);
      if (x >= y && x >= z) {
         max = x;
      } else if (y >= x && y >= z) { 
         max = y;
      } else if (z >= x && z >= y) {
         max = z;
      }
      return max;
   } 
   
   // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter3/e1-printNumbers
   // Chapter 3 - Problem 1 Printing Numbers
   public static void printNumbers (int num) {
      for (int i = 1; i <= num; i++) {
         System.out.print("[" + i + "] ");
      }
   }
   
   // https://practiceit.cs.washington.edu/problem/view/bjp3/chapter3/e10-area
   // Chapter 3 - Problem 10 Area
   public static double area(double rad) {
      double area = Math.PI * rad * rad;
      return area;
   }
   
   // https://practiceit.cs.washington.edu/problem/view/bjp3/chapter5/e7-diceSum
   // Chapter 5 - Problem 7 diceSum (Random)
   public static void diceSum (Random r, Scanner console) {
      System.out.print("Desired dice sum: ");
      int d = console.nextInt();
      int a = 0;
      int b = 0;
      while (a + b != d) {
         a = r.nextInt(6) + 1;
         b = r.nextInt(6) + 1;
         int c = a + b;
         System.out.println(a + " and " + b + " = " + c);
      }
   }
   
   // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter5/s13-sentinelMinMax
   // Chapter 5 - Problem 13 Sentinel Loop
   public static void loop (Scanner console) {
      int input = 0;
      int min = 9999; 
      int max = 0;
      while (input != -1) {
         System.out.print("Type a number (or -1 to stop): ");
         input = console.nextInt();
         if (input < min && input != -1) {
            min = input;
         } 
         if (input > max) {
            max = input;
         }
      }
      System.out.println("Maximum was " + max);
      System.out.println("Minimum was " + min);
   }
   
   // https://practiceit.cs.washington.edu/problem/view/bjp3/chapter4/s23-lastFirst
   // Chapter 4 - Problem 23 String manipulation (lastFirst)
   public static String lastFirst(String name) {
      int space = name.indexOf(" ");
      String first = name.substring(0, 1);
      String last = name.substring(space + 1);
      name = last + ", " + first + ".";
      System.out.println(name);
      return name;   
   }
   
}


   // NEED HELP WITH
   
   // https://practiceit.cs.washington.edu/problem/view/bjp3/chapter3/e11-distance
   // Chapter 3 - Problem 11 Distance
   // public static double distance (int x1, int y1, int x2, int y2) {
     // int a = x2 - x1;
     // a = (double) Math.pow(a, 2);
     // int b = y2 - y1;
     // b = (double) Math.pow(b, 2);
     // double c = (a + b) * 1.0;
     // double d =  Math.sqrt(c);
     // System.out.println(d);
     // return d;
   // }
   
   // https://practiceit.cs.washington.edu/problem/view/bjp3/chapter4/e7-xo
   // Chapter 4 - Problem 7 XO
   
   // https://practiceit.cs.washington.edu/problem/view/bjp3/chapter2/e3-fibonacci
   // Chapter 2 - Problem 3 Fibonacci
   
   // https://practiceit.cs.washington.edu/problem/view/bjp3/chapter4/e2-repl
   // Chapter 4 - Problem 2 return String (repl)
   // public static void repl (String str, int num) {
      // for (int i = 1; i <= num; i ++) {
      // System.out.print(str);
      // }
   // }
   
   // https://practiceit.cs.washington.edu/problem/view/bjp3/chapter5/e9-printFactors
   // Chapter 9 - Problem 9 Fencepost Problem (printFactors)
   // public static void printFactors (int x) {
      // for (int i = 1; i <= x; i++) {
         // if (x % i == 0) {
            // System.out.print(i + " and " + x);
         // }
      // }
   // }

   // https://practiceit.cs.washington.edu/problem/view/bjp3/chapter4/e17-swapPairs
   // Chapter 5 - Problem 17 (swapPairs)
   // public static String swapPairs (String p) {
      // int length = p.length();
      // for (int i = length; i >= 0; i--) {
         // char letter = p.charAt(i);
         // System.out.println(letter);
      // }
      // return p;
   // }

// https://practiceit.cs.washington.edu/problem/view/bjp3/chapter4/e18-wordCount
// https://practiceit.cs.washington.edu/problem/view/bjp3/chapter4/e6-printRange
// (3 * 5 < 1 + 2) || (6 != 5 && !(7 < 7)) -- > TRUE WHY