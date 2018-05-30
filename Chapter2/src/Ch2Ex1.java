// Jarod Reichel
// January 23, 2018
// AP CSA

import java.util.Scanner;

public class Ch2Ex1
{
	// method toInches converts feet and inches to inches
  public static int toInches(int feet, int inches)
  {
	 int ft = feet;
	 int in = inches;
     return 12 * ft + in;
  } // end method toInches

  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("Feet: "); // prompts user to enter # of feet
    int feet = kboard.nextInt();

    System.out.print("Inches: "); // prompts user to enter number of inches
    int inches = kboard.nextInt();

    kboard.close(); // closes scanner

    int totalInches = toInches(feet, inches);

    System.out.println(feet + " feet and " + inches + " inches = " + totalInches + " inches");
  } // end main
} 
// end class