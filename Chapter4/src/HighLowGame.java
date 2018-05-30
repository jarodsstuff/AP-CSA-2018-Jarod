// Jarod Reichel
// February 13, 2018
// AP CSA

import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
	// this program is a game where the goal is to guess the random number that is picked by the Random class.
	public static void main(String[] args) {
		// main method
		int target; // variables
		int guess;
		int count = 1; // a counter, to make sure the user never makes over 5 guesses
		Random rand = new Random(); // objects
		Scanner input = new Scanner(System.in);

		target = rand.nextInt(100) + 1; // seeds the random generator from 1 to 100

		while (count <= 5) { // gives the user 5 guesses
			System.out.println("Please enter an integer between 1 and 100"); // prompts the user
			guess = input.nextInt(); // reads the input
			if (guess == target) { // checks if guess is correct
				System.out.println("You win!!");
				count = 7; // sets counter to a higher number to end the game immediately
			} else if (guess < target) { // checks if guess is low
				System.out.println("Too Low...");
				count++;
			} else if (guess > target) { // checks if guess is high
				System.out.println("Too high...");
				count++;
			}

		}
		input.close(); // closes input
	}

}
