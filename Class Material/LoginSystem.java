// 02.03.2020 - String package (.equals), while loops, etc. 

// for loops need to know a specific amount in order for it to function.

import java.util.*;

public class LoginSystem {
   public static final String REAL_PASSWORD = "CSE142";
   
   public static void main(String[]args) {
      Scanner console = new Scanner(System.in);
      
      System.out.print("Enter your full name: ");
      String fullName = console.nextLine();
      
      System.out.println("Welcome " + fullName + "!");
      
      System.out.print("Enter your password: ");
      String password = console.nextLine();
      
      // Indefinite loop --> WHILE loops
      // while (password.equals(REAL_PASSWORD)) {
         // System.out.print("Access Granted.");
      // }   
      
      // Fence-Post Problem
      while (!password.equals(REAL_PASSWORD)) { // NOT equal - !=
         System.out.println("Incorect password.");
         System.out.print("Enter your password: ");
         password = console.nextLine();
      } 
      System.out.println("Correct password. Access granted!");
   }
}

