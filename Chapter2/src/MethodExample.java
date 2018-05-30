// Jarod Reichel
// January 25, 2018
// AP CSA

public class MethodExample {
	public static void main(String[] args) {
		int number = 7;
		int sqr = square(number);
		
		System.out.println("Number    Squared Number");
		System.out.println(number + "         " + sqr);
	} //end main
	
	// Method square returns the square of an integer
	public static int square( int num ) {
		return num * num;
	} // end method square
} // end class MethodExample
