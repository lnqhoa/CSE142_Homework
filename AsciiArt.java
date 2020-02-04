// Hoa N Le
// WIN 2020/01/15
// CSE 142 Intro to Java
// TA: Jun Song
// Assignment #2
//
// This program helps practicing System.out.print/ln() commands and writing for loops.

public class AsciiArt {
   public static void main(String[] args) {
      // H
      lineH();
      bodyH();
      lineH();
      System.out.println();
      // O
      lineO();
      bodyO();
      lineO();
      System.out.println();
      //A
      lineA();
      bodyA();
   } 
   
   public static void space() {
      for (int s = 1; s <= 4; s++) {
         System.out.print(" ");
      }
   }
   
   public static void h() {
      for (int h = 1; h <= 4; h++) {
         System.out.print("h");
      }
   }
   
   public static void o() {
      for (int o = 1; o <= 4; o++) {
         System.out.print("o");
      }
   }
   
   public static void a() {
      for (int a = 1; a <= 4; a++) {
         System.out.print("a");
      }
   }
   
   // Making letter H   
   public static void lineH() {
      for (int line = 1; line <= 4; line++) {
         // Loops for the first column
         h();
         // Loops for the space inbetween columns
         space();
         // Loops for the second column
         h();
         System.out.println();
      }
   }
   
   public static void bodyH() {
      for (int line = 1; line <= 2; line++) {
         // Loops for the h body
         for (int h = 1; h <= 12; h++) {
            System.out.print("h");
         } 
         System.out.println();   
      }
   }
   
   // Making letter O
   public static void lineO() {
         for (int i = 1; i <= 1; i++) {
            // Loops for the space
            space();
            // Loops for the line
            o();
            System.out.println();
         }
   }
   
   public static void bodyO() {
      for (int i = 1; i <= 6; i++) {
         // Loops for the first column
         o();
         // Loops for the space inbetween the column
         space();
         // Loops for the second column
         o();
         System.out.println();
      }
   }
   
   //Making letter A:
   public static void lineA() {
      for (int i = 1; i <= 2; i++) {
         // Loops for the space
         space();
         // Loops for the line
         a();
         System.out.println();
      }
   }
   
   public static void bodyA() {
      for (int i = 1; i <= 3; i++) {
         // Loops for the first half column
         a();
         // Loops for the space inbetween
         space(); 
         // Loops for the first half column
         a();
         System.out.println();
      }
      for (int i = 1; i <= 2; i++) {
         // Loops for the long line inbetween
         for (int a = 1; a <= 12; a++) {
            System.out.print("a");
         }
         System.out.println();
      }
      for (int i = 1; i <= 3; i++) {
         // Loops for the second half column
         a();
         // Loops for the sapce
         space(); 
         // Loops for the second half column
         a();
         System.out.println();
      }
   }
}

