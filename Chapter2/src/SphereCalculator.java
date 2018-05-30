// Jarod Reichel
// January 30, 2018
// AP CSA

import java.util.Scanner;

// This program calculates the diameter, circumference, surface area, and volume of a sphere after being given the radius.
public class SphereCalculator {

	// The main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creates a scanner object.
		
		System.out.print("Enter the radius of a sphere: "); // asks the user to input a radius
		double radius = input.nextDouble(); // reads the radius as a double.
		
		System.out.println("Your Sphere had a radius of " + radius + ". Here is some more information:"); // Restates what the user entered for verification.
		System.out.println("Diameter     Circumference     Surface Area       Volume"); // Headings
		System.out.println(diameter(radius) + "         " + circumference(radius) + " " + surface(radius) + " " + vol(radius)); // Results of calculations, aligned with the headings
		input.close(); // closes input
	} // end main
	// Method diameter Calculates the diameter given by 2r
	public static double diameter(double r) {
		return 2 * r;
	} // end diameter
	// Method Circumference Calculates the circumference using 2 * pi * r
	public static double circumference(double r) {
		return 2 * Math.PI * r;
	} // end circumference
	// Method surface calculates surface area using 4 * pi * r^2
	public static double surface(double r) {
		return 4 * Math.PI * (r * r);
	} // end surface
	// Method vol calculates volume using 4/3 * pi * r^3.
	public static double vol(double r) {
		return (4.0/3.0) * Math.PI * (r * r * r);
	} // end vol
} // end class
