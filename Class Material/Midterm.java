// This program calculates and reports various statistics about the results of
//   a CSE142 midterm exam. 
//
// DEVELOPMENT NOTES:
// (These notes would not be in your program's comments. They are here
// to help you understand important topics or elements of this code.)
//
// This is a modified version from Monday's lecture. Namely
// we have 2 different implementation of getCounts
// Notice the use of arrays throughout the program, especially as parameters
//   and return values. Also notice the various array traversals.

import java.util.*;
import java.io.*;

public class Midterm {

   public static final int MAX_SCORE = 101;

   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("midterm.txt"));
      
      int[] scores = getScores(input);
      int[] counts = new int[4];
      getCounts(scores, counts);
      int[] counts2 = getCounts2(scores);
    

      printStats(scores, counts);
   }
   
   // Reads in scores from the given Scanner and returns an array
   //   containing each individual score. Assumes the first value in
   //   the input is the number of scores to be read.
   //
   // Scanner input - the Scanner from which to read scores
   public static int[] getScores(Scanner input) {
      int numScores = input.nextInt(); // first line of midterm.txt
      int[] scores = new int[numScores];
      for (int i = 0; i < scores.length; i++) {
         int nextScore = input.nextInt();
         scores[i] = nextScore;
      }
      return scores;   
   }
   
   // Computes and returns the number of times each individual score was
   //   earned on the exam.
   //
   // int[] scores - the individual exam scores
   public static void getCounts(int[] scores, int[] counts) {
      for (int i = 0; i < scores.length; i++) {
         int score = scores[i];
         if (score <= 25) {
            counts[0]++;
         } else if (score <= 50) {
            counts[1]++;
         } else if (score <= 75) {
            counts[2]++;
         } else {
            counts[3]++;
         }
      }
      
   }
 
   // This version of getCounts2 creates the counts array
   // within the method rather than having it passed from main
   public static int[] getCounts2(int[] scores) {
      int[] counts = new int[MAX_SCORE + 1]; 
      for (int i = 0; i < scores.length; i++) {
         int score = scores[i];
         counts[score]++;
      }
      
      return counts;
   }
   
   // Prints out the various computed statistics about the exam
   //
   // int[] scores - the scores on the exam
   // int[] counts - the number of times each score was earned   
   public static void printStats(int[] scores, int[] counts) {
      System.out.println("Scores: " + Arrays.toString(scores));
      System.out.println("Counts: " + Arrays.toString(counts));
   }
}
