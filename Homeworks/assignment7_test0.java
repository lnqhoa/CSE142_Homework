import java.io.*;
import java.util.*;

public class assignment7_test0 {

   public static final int ARR_LENGTH = 4;   

   public static void main(String[]args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in); 
      intro();
          
      // Prompting users for input file's name
      System.out.print("input file name? " );
      String inFile = console.nextLine();
      
      // String inFile = "personality.txt";
      Scanner input = new Scanner(new File(inFile));
      
      // Prompting users for output file's name
      System.out.print("output file name? ");
      String output = console.nextLine();
      PrintStream outFile = new PrintStream(new File(output));
      
      // Run through input file
      while (input.hasNextLine()) {
         // Getting names
         String name = input.nextLine();
         // Getting answers
         String ans = input.nextLine();
         char[] answer_arr = answer_arr(ans);
         // Getting counts of answers A and B
         int[] countAs = countAB(answer_arr, 'a');
         int[] countBs = countAB(answer_arr, 'b');
         // Calculating B percentage
         int[] percentage = percentage(countAs, countBs);
         // Getting personality result
         String personality_type = personality_type(percentage);
         // Printing out results into an output file
         print_output(name, percentage, personality_type, outFile);
      }   
   }
   
   // Introduction
   public static void intro() {
      System.out.println("This program processes a file of answers to the");
      System.out.println("Keirsey Temperament Sorter. It converts the");
      System.out.println("various A and B answers for each person into");
      System.out.println("a sequence of B-percentages and then into a");
      System.out.println("four-letter personality type.");
      System.out.println();
   }
   
   // Method to change String type to char[] type,
   // taking one String answer as parameter
   public static char[] answer_arr (String answers) {
      char[] answer = new char[70];
      for (int i = 0; i < 70; i++) {
         char a = answers.toLowerCase().charAt(i);
         answer[i] = a;
      }
      return answer;
   }
   
   // Method to get answer that are As,
   // taking one char[] answers and the comparative char as parameters
   public static int[] countAB (char[] answer_arr, char choice) {
      int[] result = new int[ARR_LENGTH];
      for (int i = 0; i < 70; i++) {
         if (answer_arr[i] == choice) {
            if (i % 7 == 0) {
               result[0]++;
            } else if (i % 7 == 1 || i % 7 == 2) {
               result[1]++;
            } else if (i % 7 == 3 || i % 7 == 4) {
               result[2]++;
            } else if (i % 7 == 5 || i % 7 == 6) {
               result[3]++;
            }   
         }
      }
      return result;
   }
   
   // Method to get percentage of B,
   // taking two int[] of indicating num A or B answers as parameters
   public static int[] percentage (int[] countAs, int[] countBs) {
      int[] pct = new int[ARR_LENGTH];
      for (int i = 0; i < ARR_LENGTH; i++) {
         int b = countBs[i];
         int total = countAs[i] + countBs[i];
         double result = (b * 100.0) / total;
         int result_int = (int) Math.round(result);
         pct[i] = result_int;            
      }
      return pct;
   }
   
   // Method to give back personality type result
   // taking one int[] of B% as parameters
   public static String personality_type (int[] percentage) {
      //String [] type = new String[ARR_LENGTH];
      String type = "";
      for(int i = 0; i < ARR_LENGTH; i++) {
         if (i == 0) {
            if (percentage[i] > 50) {
               type += "I";
            } else if (percentage[i] < 50) {
               type += "E";
            } else {
               type += "X";
            }            
         } else if (i == 1) {
            if (percentage[i] > 50) {
               type += "N";
            } else if (percentage[i] < 50) {
               type += "S";
            } else {
               type += "X";
            }          
        } else if (i == 2) {
            if (percentage[i] > 50) {
               type += "F";
            } else if (percentage[i] < 50) {
               type += "T";
            } else {
               type += "X";
            }         
        } else {
            if (percentage[i] > 50) {
               type += "P";
            } else if (percentage[i] < 50) {
               type += "J";
            } else {
               type += "X";
            }         
         }
      }
      return type;
   }
   
   // Method prints into output file the results,
   // taking two String name and personality type, one int[] of B%,
   // and the PrintStream output as parameters
   public static void print_output (String name, int[] percentage, String personality_type, PrintStream output) {
      output.println(name + ": " + Arrays.toString(percentage) + " = " + personality_type);
   }
      
}