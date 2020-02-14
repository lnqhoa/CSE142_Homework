import java.util.*;

// Midterm Practice Question - https://courses.cs.washington.edu/courses/cse142/20wi/uwnetid/142-midterm-practice-questions.html

public class Midterm_practice {
   public static void main(String[]args) {
      Random r = new Random();
      Scanner console = new Scanner(System.in);
      
      trackInvestment(console, 100.0, 5);
   }
   
// NOTE - TRACKING PREV VALUE IN LOOP
// https://stackoverflow.com/questions/60219762/compare-previous-random-variable-to-a-current-random-variable-inside-a-while/60219779?noredirect=1#comment106517032_60219779
public static int noBigger(int max, Random rand) {
   System.out.println("Picking numbers from 1 to " + max);
   int num = rand.nextInt(max) + 1;
   System.out.println("Number: " + num);
   int last = num;int count = 1;
   while (num <= last) {
      double prob = (double)num / max;
      System.out.println("Probability to continue: " + prob);
      last = num;
      num = rand.nextInt(max) + 1;
      System.out.println("Number: " + num);
      count++;
    }
    System.out.println("Streak ends");
    return count;
}
   // https://courses.cs.washington.edu/courses/cse142/20wi/exams/midterm/sample-midterm.pdf
   // Problem 8
   public static void trackInvestment (Scanner console, double ivm, int year) {
      int rate = 0;
      double curr = 0.0;
      double sum = 0.0;
      System.out.println("Start with: $" + ivm);
      for (int i = 1; i <= year; i++) {
         System.out.print("This year's return rate? ");
         rate = console.nextInt();
         curr = (ivm * 1.0 * rate) / 100;
         sum += curr;
         ivm = ivm + curr;
         System.out.println("After year" + i + ": $" + ivm);
      }
      System.out.println("Total interest earned: $" + sum);
   } 
   
   // HARD
   // Midterm Practice Question - printSequenceT0(double)
   public static int printSequenceTo(double target) {
      int n = 1;
      double sum = 0.5;
      System.out.print("1/2");
      while (sum < target) {
         n++;
         System.out.print(" + " + n + "/" + (n+1));
         sum = sum + (double) n / (n + 1);
      }
      System.out.println(" = " + sum);
      return n;
   }
   
   // Midterm Practice Question - maxSevens (Random, int)
   public static int maxSevens (Random r, int n) {
      int count = 0;
      int num = 0;
      int prev = 0; 
      for (int i = 1; i < n; i++) {
         // Random number between 5 and 10
         num = r.nextInt(6) + 5;
         System.out.print(num + " ");
         if (num == 7 && prev == 7) { 
            count++;
         }
         if (num == 7) {
            prev = num;
         } else {
            prev = 0;
         }
       }
       System.out.println();
       if (count > 0) {
         count = count + 1;
       }
       System.out.println("Run of " + count + " sevens in " + n + " tries.");   
       return count;
   }  
   
   // Midterm Practice Question - Ant(Random)
   public static void Ant (Random r) {
      int slip = 0;
      int current = 0;
      while (current != 6) {
         int advance = r.nextInt(2);
         if (advance == 1) {
            slip++;
            current = 0;
         } else {
            current++;
         }
         System.out.println(current + " ");
      }
      System.out.println("number of falls: " + slip);
   }
   
   // Midterm Practice Question - areReversals(String, String)
   public static boolean areReversals (String a, String b) {
      boolean statement = true;
      String reverse = "";
      for (int i = a.length(); i >= 1; i--) {
         reverse = reverse + a.charAt(i-1);
      }
      if (reverse.equalsIgnoreCase(b) == true) {
         statement = true;
      } else {
         statement = false;
      }
      System.out.print(statement);
      return statement;
   }
   
   // Midterm Practice Question - diagnose(Scanner) 
   public static void diagnose (Scanner console) {
      System.out.print("Temperature? ");
      double temp = console.nextDouble();
      System.out.print("Headache? ");
      String head = console.next();
      System.out.print("Heart rate? ");
      int rate = console.nextInt();
      if (rate <= 20) {
         System.out.print("Heart Problem");
      } else if (temp >= 100.4 && head.toLowerCase().startsWith("y")) {
         System.out.print("Fever");
      } else if (temp < 100.4 && head.toLowerCase().startsWith("y")) {
         System.out.print("Cold");
      } else {
         System.out.print("Just Fine");
      }
   }
   
   // Midterm Practice Question - generateGrades(Random, int)
   public static void generateGrades(Random r, int n) {
      int min = 21;
      int sum = 0;
      int count = 1;
      int grade = r.nextInt(21);
      System.out.print("grades: " + grade); 
      while (count != n) {
         grade = r.nextInt(21);
         sum += grade;
         if (min > grade) {
            min = grade;
         }
         count ++;
         System.out.print(", " + grade);
      }  
      double average = (sum * 10.0) / (n * 10.0);
      System.out.println();
      System.out.println("min grade: " + min);
      System.out.println("total points: " + sum);
      System.out.println("average grade: " + average);
   }
    
}

