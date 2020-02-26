// Hoa N Le
// WIN 2020/02/19
// CSE 142 Intro to Java
// TA: Jun Song
// Assignment #6
//
// This program 
import java.util.*;
import java.io.*;

public class YazInterpreter {
   public static void main(String[]args) throws FileNotFoundException {
      intro();
      Scanner console = new Scanner(System.in);
      
      // Prompting users for the function they want to use
      String answer = prompt(console);
      
      // Answer is not a case-insensitive version of "C", "I" or "Q"
      while (!answer.toLowerCase().equals("c") && !answer.toLowerCase().equals("i") &&
             !answer.toLowerCase().equals("q")) {
               answer = prompt(console);
             }
             
      // Answer is a case sensitive veersion of "C"
      if (answer.toLowerCase().equals("c")) {
         System.out.println("YazInteractions session. Type END to exit.");
      }
      
      // Answer is a case-insensitive version of "C" 
      while (answer.toLowerCase().equals("c") || answer.toLowerCase().equals("i") ||
            answer.toLowerCase().equals("q")) {
         if (answer.toLowerCase().equals("c")) {
            String function = console.nextLine();
            // Use convert(String value) function to convert temp
            if (function.toLowerCase().startsWith("convert")) {
               convert(function);
            } 
            // User range() function
            else if (function.toLowerCase().startsWith("range")) {
               range(function);
            } 
            // Use repeat() function
            else if (function.toLowerCase().startsWith("repeat")) {
               repeat(function);
            } 
            // Reprompt the user with prompt(Scanner console) function
            else if (function.toLowerCase().startsWith("end")) {
                     System.out.println();
                     prompt(console);
            }                    
         } else if (answer.toLowerCase().equals("i")) { // Answer is a case-insensitive version of "I" 
            System.out.println();
            prompt(console);          
         } else {
            answer = "";
         }
      }      
   }
   
   // Introduction
   public static void intro() {
    System.out.println("Welcome to the YazInterpreter!");
    System.out.println("You may interpret a YazLang program and output");
    System.out.println("the results to a .txt file or enter console YazInteractions");
    System.out.println("mode to run single commands of YazLang.");
    System.out.println();   
   }
   
   // User Prompt for "C", "I" or "Q"
   public static String prompt (Scanner console) {
      System.out.print("(C)onsole YazInteractions, (I)nterpret .yzy program, (Q)uit? ");
      String answer = console.next();
      return answer;
   }   
   
   // Method that convert temperature between F and C
   public static int convert (String value) {
      int temp_convert = 0;
      // Setting up new Scanner to read the User-input string
      Scanner token = new Scanner(value);
      // Take out the word "CONVERT"
      String fnc = token.next();
      // Get the temperature that needs to be converted
      int temp = token.nextInt();
      // Current unit of temperature
      String type = token.next();
      type = type.toLowerCase();
      if (type.equals("f")) {
         temp_convert = (int) Math.round((temp - 32)/1.8); 
         System.out.println(temp_convert + "C");
      } else if (type.equals("c")) {
         temp_convert = (int) Math.round(1.8 * temp + 32);
         System.out.println(temp_convert + "F");
      }
      return temp_convert;
   }
   
   // Method that print a sequence of numbers
   // until arg 1 + arg 3 >= arg 2 
   public static void range (String value) {
      // Setting up new Scanner to read the User-input string
      Scanner token = new Scanner(value);
      // Take out the word "RANGE"
      String fnc = token.next();
      // Read in the three interger arguments
      int arg_1 = token.nextInt();
      int arg_2 = token.nextInt();
      int arg_3 = token.nextInt();
      while (arg_1 < arg_2) {
         System.out.print(arg_1 + " ");
         arg_1 += arg_3;
      }
      System.out.println();
   }

   // Method that print out string argument repeated 
   // number of times indicated by following interger
   public static void repeat (String value) {
      // Setting up new Scanner to read the User-input string
      Scanner token = new Scanner(value);
      String fnc = token.next();
      while (token.hasNext()) {
         // Seperate the string that starts with \" and end with \"
         String str = token.next();
         str = str.replace("\"", "");
         str = str.replace("_", " ");
         int num = token.nextInt();
         for (int i = 1; i <= num; i++) {
            System.out.print(str);
         }      
      }
      System.out.println();
   }
}
