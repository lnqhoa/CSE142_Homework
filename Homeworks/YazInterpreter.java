// Hoa N Le
// WIN 2020/02/19
// CSE 142 Intro to Java
// TA: Jun Song
// Assignment #6
//
// This program will prompt user for one among three options:
// A YZL console, interpret a YZL program from a file, or quit.
// It can convert temparatures between Celcius and Fahrenheit.
// It can also print a new sequence using three different arguments.
// It can also print out a new string argument with the repeated times 
// indicated by an arbitrary number.

import java.util.*;
import java.io.*;


public class YazInterpreter {
   public static void main(String[]args) throws FileNotFoundException {
      // Setting up Scanner and output file
      Scanner console = new Scanner(System.in);

      intro();
      // Prompting users for the function they want to use
      String answer = prompt(console);
      
      // Answer is not a case-insensitive version of "C", "I" or "Q"
      while (!answer.equalsIgnoreCase("c") && !answer.equalsIgnoreCase("i") &&
             !answer.equalsIgnoreCase("q")) {
               answer = prompt(console);
             }
             
      // Answer is a case sensitive veersion of "C"
      if (answer.equalsIgnoreCase("c")) {
         System.out.println("YazInteractions session. Type END to exit.");
      }
      
      // Answer is a case-insensitive version of "C" 
      while (!answer.equalsIgnoreCase("q")) {
         if (answer.equalsIgnoreCase("c")) {
            String function = console.nextLine();
            String result = if_else(function);
            System.out.println(result);
            if (function.equalsIgnoreCase("end")) {
               answer = prompt(console);
            }
         // Answer is a case-insensitive version of "I"                    
         } else if (answer.equalsIgnoreCase("i")) {  
            String name_input = interpret(console);
            readFile(console, name_input);
            System.out.println();
            answer = prompt(console);         
         } else if (answer.equalsIgnoreCase("q")) {
            answer = "";
         } else {
            answer = prompt(console);
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
      String input = console.nextLine();
      return input;
   }   

   // Method that convert temperature between F and C
   public static int convert (String input) {
      int temp_convert = 0;
      // Setting up new Scanner to read the User-input string
      Scanner token = new Scanner(input);
      // Take out the word "CONVERT"
      String fnc = token.next();
      // Get the temperature that needs to be converted
      int temp = token.nextInt();
      // Current unit of temperature
      String type = token.next().toLowerCase();
      if (type.equals("f")) {
         temp_convert = (int) ((temp - 32)/1.8); 
      } else if (type.equals("c")) {
         temp_convert = (int) (1.8 * temp + 32);
      }
      return temp_convert;
   }
   // Temperature type
   public static String temp_type (String input) {
      int temp_convert = 0;
      // Setting up new Scanner to read the User-input string
      Scanner token = new Scanner(input);
      // Take out the word "CONVERT"
      String fnc = token.next();
      // Get the temperature that needs to be converted
      int temp = token.nextInt();
      // Current unit of temperature
      String type = token.next();
      if (type.equalsIgnoreCase("c")) {
         type = "f";
      } else if (type.equalsIgnoreCase("f")) {
         type = "c";
      }
      return type;
   }

   // Method that print a sequence of numbers
   // until arg 1 + arg 3 >= arg 2 
   public static String range (String input) {
      // Setting up new Scanner to read the User-input string
      Scanner token = new Scanner(input);
      // Take out the word "RANGE"
      String fnc = token.next();
      // Read in the three interger arguments
      int arg_1 = token.nextInt();
      int arg_2 = token.nextInt();
      int arg_3 = token.nextInt();
      String result = "";
      
      while (arg_1 < arg_2) {
         result += arg_1 + " ";
         arg_1 += arg_3;
      }
      return result;
   }

   // Method that print out string argument repeated 
   // number of times indicated by following interger
   public static String repeat (String input) {
      // Setting up new Scanner to read the User-input string
      Scanner token = new Scanner(input);
      String fnc = token.next();
      String result = "";
      while (token.hasNext()) {
         // Seperate the string that starts with \" and end with \"
         String str = token.next();
         // String replacement
         str = str.replace("\"", "");
         str = str.replace("_", " ");
         int num = token.nextInt();
         for (int i = 1; i <= num; i++) {
            result += str;
         }     
      }
      return result;
   }

   // Method use to get file and interpret the file
   public static String interpret (Scanner console) throws FileNotFoundException {
      // Prompt user for input file's name
      System.out.print("Input file name: ");
      String name_input = console.nextLine();
      File file_input = new File(name_input);
      while(!file_input.exists()) {
         System.out.print("File not found. Try again: ");
         name_input = console.nextLine();
         file_input = new File(name_input);
      }
      return name_input;
   }   
   
   // Read in the file and create an output file
   public static void readFile (Scanner console, String file_input) 
                                throws FileNotFoundException {
      // Setting up new Scanner to scan the file
      Scanner input = new Scanner (new File(file_input));
      // Prompt user for output file's name
      System.out.print("Output file name: ");
      String name_output = console.nextLine();
      PrintStream file_output = new PrintStream(new File(name_output));
      System.out.println("YazLang program interpreted and output to .txt file!");
      // Print results into .txt file
      while (input.hasNext()) {
         String function = input.nextLine();
         String result = if_else(function);
         file_output.println(result);
      }
   }
   
   // If/else statement answer equals to Convert/Range/Repeat
   public static String if_else (String answer) {
      Scanner input = new Scanner(answer);
      String function = input.next();
      String result = "";
      if (function.equalsIgnoreCase("convert")) {
         int new_temp = convert(answer);
         String f_c = temp_type(answer);
         f_c = f_c.toUpperCase();
         result = new_temp + "" + f_c;
      } else if (function.equalsIgnoreCase("range")) {
        result = range(answer);
      } else if (function.equalsIgnoreCase("repeat")) {
        result = repeat(answer);
      }
      return result;   
   }    
}