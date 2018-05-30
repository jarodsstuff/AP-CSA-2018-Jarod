// Shelby Bush
// January 30, 2018
// AP CSA 

// This program determines how much older a father is in comparison to his son

import java.util.Scanner; // import statement

public class Test3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter how old the father is in years.");
		int fatherYears = input.nextInt();
		System.out.println("Enter how old the father is in months.");
		int fatherMonths = input.nextInt();
		
		System.out.println("Enter how old the son is in years.");
		int sonYears = input.nextInt();
		System.out.println("Enter how old the son is in months.");		
		int sonMonths = input.nextInt();
		
		int fatherMonthAge = fatherYears * 12 + fatherMonths; // calculates how old the father is in months
		int sonMonthAge = sonYears * 12 + sonMonths; // calculates how old the son is in months
				
		int monthsOlder = fatherMonthAge - sonMonthAge; // calculates how many months older the father is than the son
		
		int finalYearsOlder = monthsOlder / 12; // changes the value of total months older into years
		int finalMonthsOlder = monthsOlder % 12; // calculates the remaining months that the father is older
		
		System.out.println("The father is " + finalYearsOlder + " years and " + finalMonthsOlder + " months older than his son.");
		
		input.close();

			
	} // end main
	
} // end class Test3