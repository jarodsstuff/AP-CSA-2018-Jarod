// Jarod Reichel
// February 12, 2018
// AP CSA

import java.util.Scanner;

public class TelephoneCall {
	// this program takes the length of a call at a pay phone and calculates how much it costs.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // creates the scanner
		System.out.print("Enter the length of your call (in minutes): "); // prompts the user
		double callLength = input.nextInt(); // sets the call length to the user input
		double cost = 0; // temporarily initializes cost to 0 to prevent the IDE from flagging line 22 as an error
		
		if (callLength <= 0) { // if less than or equal to 2 minutes, there is a fixed cost
			cost = 1.15;
		}
		else if (callLength > 2) { // after two minutes, each additional minute is 50 cents.
			cost = 1.15 + ((callLength - 2) * 0.50);
		}
		System.out.println("The cost of your call is $" + cost); // prints the resulting cost

		input.close();
	} // end main
	public static String isNumberNegativeOrZero() {
		return "You entered an invalid number!";
	}
	public static double overTwoMins(double length) {
		return 1.15 + ((length - 2) * 0.50);
	}
	
} // end class
