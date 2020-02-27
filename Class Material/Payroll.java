// This program reads in a roster of course staff members and computes and outputs
//   each person's pay for the week. Each type of staff member is paid using a
//   different model.
//
// DEVELOPMENT NOTES:
// (These notes would not be in your program's comments. They are here
// to help you understand important topics or elements of this code.)
//
// Notice the use of line-based file input in main, and the use of a Scanner
//   to tokenize a String in the pay methods.
//
// Although we have methods calling each other in a row, this program is NOT 
//   an example of chaining, because the structure of the code accurately
//   reflects the task being performed, and main remains a concise overall
//   summary of the behavior.

import java.util.*;
import java.io.*;

public class Payroll {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("employees.txt"));
      
      while (input.hasNextLine()) {
         String employee = input.nextLine();
         process(employee);
      }
   }
   
   // Processes an employee text string
   // 
   // String employee - the employee to determine pay for
   public static void process(String employee) {
      if (employee.startsWith("Instructor")) {
         payInstructor(employee);
      } else if (employee.startsWith("Grader")) {
         payGrader(employee);
      } else if (employee.startsWith("TA")) {
         payTA(employee);
      }
   }
   
   // Computes and outputes the pay for an instructor; instructors get paid a flat
   //   amount per week
   // Instructor input will consist of the employee type, a name, and the weekly pay
   //   rate for that instructor
   //   
   // String instructor - the input for the instructor to pay
   public static void payInstructor(String instructor) {
      Scanner tokens = new Scanner(instructor);
      String type = tokens.next();
      String name = tokens.next();
      
      double pay = tokens.nextDouble();
      System.out.println(name + " (" + type + ") earned $" + pay + " this week.");
   }    
   
   // Computes and outputes the pay for a grader; graders get paid a given amount
   //   for each student they grade
   // Grader input will consist of the employee type, a name, and the number of
   //   students graded, and the pay per student for that grader
   //
   // String grader - the input for the grader to pay
   public static void payGrader(String grader) {
      Scanner tokens = new Scanner(grader);
      String type = tokens.next();
      String name = tokens.next();
      
      int students = tokens.nextInt();
      double rate = tokens.nextDouble();
      
      double pay = students * rate;
      System.out.println(name + " (" + type + ") earned $" + pay + " this week.");
   }  

   
   // Computes and outputes the pay for a TA; TAs get paid $15/hour and can work any 
   //   number of days
   // TA input will consist of the employee type, a name, and some number of values
   //   representing the hours worked on each of several days
   // 
   // String ta - the input for the TA to pay
   public static void payTA(String ta) {
      Scanner tokens = new Scanner(ta);
      String type = tokens.next();
      String name = tokens.next();
      
      int hours = 0;
      while (tokens.hasNextInt()) {
         hours += tokens.nextInt();
      }
      
      double pay = hours * 15.00;      
      System.out.println(name + " (" + type + ") earned $" + pay + " this week.");
   }   
}