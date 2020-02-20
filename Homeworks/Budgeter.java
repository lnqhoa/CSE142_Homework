// Hoa N Le
// WIN 2020/01/29
// CSE 142 Intro to Java
// TA: Jun Song
// Assignment #4
//
// This program takes in users income and expense amounts then helps calculating the 
// total income and expense per month and per day. In the end, the program announced
// whether the user has saved or spent more than they earn with a specific amount. 

import java.util.*;

public class Budgeter {

   public static final int DAYS_INMONTH = 30;
   
   public static void main(String[]args) {
      
      Scanner console = new Scanner(System.in);
      
      // Program's Intro
      intro();
      
      // Info on income
      double sumIncome = getInfo(console, "income");
      
      // Info on expense's TYPE
      int expType = expenseType(console);
      
      // Info on expense      
      double sumExpense = getInfo(console, "expense");
      if (expType == 1) { // monthly
         sumExpense = sumExpense;
      } else if (expType == 2) { // daily
         sumExpense = sumExpense * DAYS_INMONTH;
      }
      
      // Summary about income
      double incomeRate = getRate(sumIncome, "income");
      // Summary about expense
      double expenseRate = getRate(sumExpense, "expense");
      System.out.println();
      
      // User's net income
      netIncome(sumIncome, sumExpense);  
   }
   
   public static void intro () {
      System.out.println("This program asks for your month income and");
      System.out.println("expenses, then tells you your net monthly income.");
      System.out.println();
   }
   
   // Method to get GENERAL INFO + TOTAL of income/expense
   public static double getInfo (Scanner console, String type) {
      double sum = 0;
      // Sort out income/expense and number for loops
      System.out.print("How many categories of " + type + "? ");
      int choice = console.nextInt();
      // User inputs income/expense + finding SUM
      for (int i = 1; i <= choice; i++) {
         System.out.print("   Next " + type + " amount? $");
         double amount = console.nextDouble();
         sum += amount;         
      }
      System.out.println();
      return sum;
   }
   
   // Method to find whether EXPENSE is MONTHLY/DAILY 
   public static int expenseType(Scanner console) {
      System.out.print("Enter 1) monthly or 2) daily expenses? ");
      int choice = console.nextInt();
      return choice;
   }
   
   // Method to find SUMMARY (total + daily rate) of income/expense
   public static double getRate (double num, String type) {
      // Print out sum with two decimal place
      System.out.print("Total " + type + " = $" + round(num));
      // Daily rate with changeable days/month
      double rate = num/DAYS_INMONTH;
      System.out.println(" ($" + round(rate) + "/day)");
      return rate;
   }
   
   // Method to find monthly NET INCOME
   public static double netIncome(double sumIncome, double sumExpense) {
      double net = sumIncome - sumExpense;
      net = round(net);
      if (net <= 0) { // User spent more than their income
         System.out.println("You spent $" + Math.abs(net) + " more than you earned this month.");
         if (-250 <= net) { // Spend more than $250 (in negative)
            System.out.println("You're a spender.");
         } else { // Spend less than $250 (in negative)
            System.out.println("You're a big spender.");
         }
      } else {
         System.out.println("You earned $" + net + " more than you spent this month.");
         // Save more than $250
         if (net > 250) {
            System.out.println("You're a big saver.");
         } else { // Save less than $250
            System.out.println("You're a saver.");
         }
      }
      System.out.println("Save money, don't do drugs. Thank you for using my program!");
      return net;
   }
   
   // Rounding to two decimal place
   public static double round (double num) {
      return Math.round(num * 100.00) / 100.0;
   }
}