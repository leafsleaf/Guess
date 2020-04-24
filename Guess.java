// Aaron Reagan
// 4/20/2020
// CS 145
// Lab #1: Guessing Game Fix
//
// This program is supposed to play a guessing game taking input from the user and
// giving him hints to go higher or lower based on what they input, updated and streamlined

import java.util.Random;
import java.util.Scanner;

public class Guess {

   public static void main(String[] args) { // where the game is played
	
	   int numGuess = 0;
	   int guess;
   
	      Random random = new Random();
	      int randNum = random.nextInt(100);
	      try (Scanner input = new Scanner(System.in)) {
			boolean gameOver = false;
			  
			  guessIntro();
     
     while (gameOver == false) {
     
     System.out.println("Your guess?:");
     guess = input.nextInt();
     numGuess++;
     
     if (guess == randNum) {
			 gameOver = true;
     
     }

     else if (guess < randNum) {       	// too low
     System.out.println("It's higher.");
     }
     
     else if (guess > randNum) {	// too high
			 System.out.println("It's lower.");
     }

    }
		}
	      System.out.println("You win!");	// win
     System.out.println("The number was " + randNum);
     System.out.println("You got it right in " + numGuess + " guesses");
     
   }

	public static void guessIntro() { // game intro
			System.out.println("This program will allow you to play a guessing game.");
			System.out.println("I will think of a number between 1 and");
			System.out.println("100 and will allow you to guess until");
			System.out.println("you get it. For each guess, I will tell you");
			System.out.println("whether the answer is higher or lower");
			System.out.println("than your guess.");

	}
}