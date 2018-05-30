// Jarod Reichel
// January 24, 2018
// AP CSA

import java.util.Scanner;

public class InchesToFeet
{
	// method toFeet
  public static int toFeet(int inches)
  {
	 
     return inches/12;
  } // end method toFeet
  public static int toInches(int in, int ft)
  {
	  return in - 12 * ft;
  }
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("Inches: "); // prompts user to enter number of inches
    int inches = kboard.nextInt();

    kboard.close(); // closes scanner

    int totalFeet = toFeet(inches);
    int inchesLeft = toInches( inches, totalFeet );
    System.out.println(totalFeet + " feet " + inchesLeft + " inches");
  } // end main
} 
// end class