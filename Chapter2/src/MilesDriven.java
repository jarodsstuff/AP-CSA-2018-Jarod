// Jarod Reichel
// January 24. 2018
// AP CSA

import java.util.Scanner;

public class MilesDriven {
	// Calculates miles driven
	public static double milesDriven(double mpg, double gal)
	{
		return mpg * gal;
	}// End method milesDriven
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // creates the scanner
		
		System.out.print("Enter your car's Miles per Gallon: "); // prompts the user for MPG
		double milesPerGallon = input.nextDouble(); // reads the input
		
		System.out.print("Enter the number of gallons used: "); // prompts the user for a number of gallons
		double numOfGallons = input.nextDouble(); // reads the input
		
		double totalMiles = milesDriven(milesPerGallon, numOfGallons); // calls the method
		
		input.close(); // closes the scanner
		
		System.out.println("You drove " + totalMiles + " miles."); // prints the result

	} // end main

} // end class
