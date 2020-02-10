// Hoa N Le
// WIN 2020/02/05
// CSE 142 Intro to Java
// TA: Jun Song
// Assignment #5
//
// This program allows users to play guessing game in which the game would have a randomized interger.
// Until the users guess the correct answer, the program will promp for an answer with a hint - lower/higher. 
// Once they get it right, users will be informed of number of guesses they made and to choose to play again.

import java.util.*;

public class GuessingGame {

   public final int answer = 0;
   
   public static void main(String[]args) {
      Scanner console = new Scanner(System.in);
      Random r = new Random();
      
      int totalGames = 0;
      int totalGuess = 0; 
      int nGuess = 0;
      int min = 1000;
      String choice = "Y";
      
      intro();
      // While the choice starts with the letter "y" regardless of lower/upper case, 
      // users can play guessing game.
      while (choice.toLowerCase().startsWith("y")) {
         nGuess = game(console, r);
         totalGames++;
         totalGuess += nGuess;
         // If the number of guess in a game is smaller than min, set min equal to the number of guess.
         if (nGuess < min) {
            min = nGuess;
         }
         // Reset on the choice to replay
         choice = replay(console);
      }
      // Overall Results
      printStats(totalGames, totalGuess, min);
   }
   
   // Method introduces the program + game
   public static void intro() {
      System.out.println("This is a guessing game");
      System.out.println("Guess as much until you are right");
      System.out.println("Play again if you want.");
      System.out.println();
   }
  
  // Method lets users play the guessing game
   public static int game(Scanner console, Random r) {
      int numGuess = 0;
      int answer = r.nextInt(100) + 1;
      int guess = 0;
      System.out.println("I'm thinking of a number between 1 and 100...");
      while(guess != answer) {
         System.out.print("Your guess? ");
         guess = console.nextInt();
         if (guess > answer) {
           System.out.println("It's lower.");
         } else if (guess < answer) {
            System.out.println("It's higher.");
         }
         numGuess++;
      }
      System.out.println("You got it right in " + numGuess + " guesses!");
      return numGuess; 
   }
   
   // Method asks if users want to replay
   public static String replay(Scanner console) {
         String replay = "";
         System.out.print("Do you want to play again? ");
         replay = console.next();
         System.out.println();
         return replay;
   }
   
   // Method gives users overall results, including: 
   // Total games played, total guesses, ratio of guess per game and game with least guesses 
   public static void printStats(int totalGames, int totalGuess, int min) {
      System.out.println("Overall results:");
      System.out.println("Total games = " + totalGames);
      System.out.println("Total guesses = " + totalGuess);
      double perGame = (totalGuess  * 1.0 /totalGames);
      System.out.println("Guesses/game = " + round(perGame));
      System.out.println("Best game =  " + min);
   }
   
   // Method rounds to one decimal place
   public static double round (double num) {
      return Math.round(num * 10.0) / 10.0;
   }
}