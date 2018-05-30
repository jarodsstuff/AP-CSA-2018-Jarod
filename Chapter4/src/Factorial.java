// Jarod Reichel
// February 12, 2018
// AP CSA

import java.util.Scanner;

public class Factorial {
	// finds the factorial of a number
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // creates the scanner
		
		System.out.print("Enter a number greater than 0: "); // prompts the user
		long number = input.nextInt(); // reads the input
		long product = 1;
		long count = 1;
		
		while (count <= number) { // calculates the factorial, prints the intermediate ones
			product = product * count;
			System.out.println(product);
			count++;
		}
		System.out.println("The Factorial of " + number + " is " + product); // prints the final answer
		input.close();
	} // end main

} // end class
