// Hoa N Le
// WIN 2020/01/15
// CSE 142 Intro to Java
// TA: Jun Song
// Assignment #2
//
// This program helps practicing System.out.print/ln() commands and writing for loops.

public class SpaceNeedle {
   
   public static final int SIZE = 4;
   
   public static void main(String[] args) {
      spaceLine();
      dome();
      flipDome();
      spaceLine();
      body();
      dome();
   }
   
   // Method for the absolute line - WITHTOUT space
   public static void emptyLine() {
      for (int line = 1; line <= 2; line++) {
         System.out.print("|");
      }
   }   

   // Method for the absolute line - WITH space 
   public static void spaceLine() {
      for (int i = 1; i <= SIZE; i++) {
         for (int s = 1; s <= SIZE*3; s ++) {
            System.out.print(" ");
         }
         emptyLine();
         System.out.println();
      }
   }
   
   // Method for the dome
   public static void dome() {
      for (int i = 1; i <= SIZE; i++) {
         // Loops for the empty space
         for (int s = 1; s <= -3 * i + (SIZE*3); s++) {
            System.out.print(" ");
         }
         // Loops for the underscores
         for (int u = 1; u <= 2; u++) {
            System.out.print("_");
         }
         // Loops for the slashes
         for (int sl = 1; sl <= 1; sl++) {
            System.out.print("/");
         }
         // Loops for the colons
         for (int c = 1; c <= 3 * i - 3; c++) {
            System.out.print(":");
         }
         emptyLine();
         // Loops for the colons
         for (int c = 1; c <= 3 * i - 3; c++) {
            System.out.print(":");
         }        
         // Loops for the back slashes
         for (int sl = 1; sl <= 1; sl++) {
            System.out.print("\\");
         }
         // Loops for the underscores
         for (int u = 1; u <= 2; u++) {
            System.out.print("_");
         }              
         // Loops for "exiting" the current sequence
         System.out.println();
      }
      // Bottom of the dome
      System.out.print("|");
      // Loops for the quotation mark
      for (int q = 1; q <= SIZE * 6; q++) {
         System.out.print("\"");
      }
      System.out.println("|");
   }
   
   // Method for the upside down dome
   public static void flipDome() {
      for (int i = 1; i <= SIZE; i++) {
         // Loops for the empty space
         for (int s = 1; s <= 2 * i - 2; s++) {
            System.out.print(" ");
         }
         // Loops for the \\_/
         for (int s1 = 1; s1 <= 1; s1++) {
            System.out.print("\\_/");
         }
         // Loops for the \\/
         for (int s2 = 1; s2 <= -2 * i + SIZE * 3; s2++) {
            System.out.print("\\/");
         }
         // Loops for the \\_/
         for (int s1 = 1; s1 <= 1; s1++) {
            System.out.print("\\_/");
         }        
         System.out.println();
      }
   }
   
   // Method for the body 
   public static void body() {
      for (int i = 1; i <= SIZE * SIZE; i++) {
         // Loops for the empty space
         for (int s = 1; s <= (SIZE * 2) + 1; s++) {
            System.out.print(" ");
         }
         // Loops for the first sequence - |
         for (int s1 = 1; s1 <= 1; s1++) {
            System.out.print("|");
         }
         // Loops for the second sequence - %
         for (int s2 = 1; s2 <= SIZE - 2; s2++) {
            System.out.print("%");
         }
         emptyLine();
         // Loops for the second sequence - %
         for (int s2 = 1; s2 <= SIZE - 2; s2++) {
            System.out.print("%");
         }
         // Loops for the first sequence - |
         for (int s1 = 1; s1 <= 1; s1++) {
            System.out.print("|");
         }
         System.out.println();
      }
   }
}

