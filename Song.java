// Hoa N Le
// WIN 2020/01/10
// CSE 142
// TA: 
// Assignment #1
//
// This program will get me used to Java programming and practing System.out.println() commands, while trying to eliminate redundancy.

public class Song {
   public static void main(String[] args) {
      firstVerse();
      secondVerse();
      thirdVerse();
      fourthVerse();
      fifthVerse();
      sixthVerse();
      lastVerse();
   }
   
   // Verse for Fly
   public static void animalFly() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println();
   }
   // Verse for Spider and Fly
   public static void animalSpider() {
      System.out.println("She swallowed the spider to catch the fly,");
      animalFly();
   }
   
   // Verse for Bird, Spider and Fly
   public static void animalBird() {
      System.out.println("She swallowed the bird to catch the spider,");
      animalSpider();
   }
   
   // Verse for Cat, Bird, Spider and Fly
   public static void animalCat() {
      System.out.println("She swallowed the cat to catch the bird,");
      animalBird();
   }

   // Verse for Dog, Cat, Bird, Spider and Fly
   public static void animalDog() {
      System.out.println("She swallowed the dog to catch the cat,");
      animalCat();
   }
   
   public static void firstVerse() {
      System.out.println("There was an old woman who swallowed a fly.");
      animalFly();
   }
   
   public static void secondVerse() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      animalSpider();
   }
   
   public static void thirdVerse() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      animalBird(); 
   }
   
   public static void fourthVerse() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      animalCat(); 
   }
   
   public static void fifthVerse() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      animalDog();
   }
   
   public static void sixthVerse() {
      System.out.println("There was an old woman who swallowed a chimpazee,");
      System.out.println("It is crazy to swallow a chimpazee.");
      System.out.println("She swallowed the chimpanzee to catch the dog,");
      animalDog();
   }
   
   public static void lastVerse() {
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }
}
