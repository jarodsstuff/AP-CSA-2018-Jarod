// Jarod Reichel
// January 25, 2018
// AP CSA


public class DoubleAddTwo {

	public static void main(String[] args) {
		int num = 700; // Declares the number being sent to method doubleAddTwo
		int doubleAddTwo = doubleAddTwo(num); // Stores the result from the method

		System.out.println("Number    Double and add two"); // Prints the header row
		System.out.println(num + "       " + doubleAddTwo); // prints the input and output number
	} // end method main
	
	// this method takes an integer as input, doubles it, adds two, and returns the result.
	public static int doubleAddTwo(int number) {
		return (2 * number) + 2;
	} // end method doubleAddTwo
} // end class DoubleAddTwo
