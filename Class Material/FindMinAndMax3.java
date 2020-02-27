// A program to read in any number of real numbers from a file and find
//   the minimum and maximum values read. Can handle any number of values
//   in the file (including zero) as well as non-numbers interspersed.
//   Assumes the first token of the file is a real number.
//
// DEVELOPMENT NOTES:
// (These notes would not be in your program's comments. They are here
// to help you understand important topics or elements of this code.)
//
// Note the use of .hasNext() vs. .hasNextDouble() and .next() vs. nextDouble()
//   to check for/read any token or specifically a double.
import java.util.*;
import java.io.*;

public class FindMinAndMax3 {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("numbers3.txt"));
      
      if (input.hasNextDouble()) {
         double number = input.nextDouble();
         System.out.println("Read number: " + number);
         
         double min = number;
         double max = number;
         int count = 1;
         
         while (input.hasNext()) {
            if (input.hasNextDouble()) {     // found a number
               number = input.nextDouble();
               count++;
               System.out.println("Read number: " + number);
   
               if (number > max) {
                  max = number;
               }
               if (number < min) {
                  min = number;
               }
            } else {    // found not a number
               String token = input.next();
               System.out.println("    Skipping non-number: " + token);
            }
         }
         
         System.out.println();
         System.out.println("Read " + count + " numbers.");
         System.out.println("Maximum value: " + max);
         System.out.println("Minimum value: " + min);
      }
   }
   
   public static void interpret(Scanner console) {
     System.out.print("Input file name: ");
     String file_input = console.next();
     // while input file name is wrong and it doesn't end in .yzy
     System.out.print("File not found. Try again: ");
     file_input = console.next();
     // once find the file name
     System.out.print("Output file name: ");
     String output_file = console.next();
     System.out.println() 
      
   }    
}
