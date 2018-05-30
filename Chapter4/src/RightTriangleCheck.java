// Jarod Reichel
// February 12, 2018
// AP CSA

import java.util.Scanner;

public class RightTriangleCheck { // this program takes three sides of a triangle and determines whether it is a right triangle.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // create the scanner
		
		int s1, s2, s3; // declare three side variables
		System.out.println("Enter three positive integer sides of a triangle: ");
		s1 = input.nextInt(); // initialize the sides to the user input.
		s2 = input.nextInt();
		s3 = input.nextInt();
		
		if ((s1 * s1) + (s2 * s2) == (s3 * s3)) { // checks with the pythagorean theorem, a^2 + b^2 = c^2
			System.out.println("Is a right triangle");
		} else if ((s1 * s1) + (s3 * s3) == (s2 * s2)) { // checks again with a different side arrangement
			System.out.println("Is a right triangle");
		} else if ((s2 * s2) + (s3 * s3) == (s1 * s1)) { // checks again
			System.out.println("Is a right triangle");
		} else {
			System.out.println("Is not a right triangle");
		}
		
		input.close(); // close the input
	} // end main

} // end class
