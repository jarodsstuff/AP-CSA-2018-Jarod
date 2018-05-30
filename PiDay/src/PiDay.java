// March 16, 2018
// Jarod Reichel
// AP CSA

// This program approximates pi using the Monte Carlo method
public class PiDay {

	//main method
	public static void main(String[] args) {
		// creates variables that call the countHits method for 100, 1000, and 10000 iterations
		double hitCountTenThousand = countHits(10000);
		double hitCountThousand = countHits(1000);
		double hitCountHundred = countHits(100);
		// variables that calculate pi approximations and distances from actual pi for 100, 1000, and 10000 iterations
		double piHundred = calcPi(hitCountHundred, 100);
		double piThousand = calcPi(hitCountThousand, 1000);
		double piTenThousand = calcPi(hitCountTenThousand, 10000);
		double diffHundred = Math.abs(Math.PI - piHundred);
		double diffThousand = Math.abs(Math.PI - piThousand);
		double diffTenThousand = Math.abs(Math.PI - piTenThousand);
		
		// Welcome Message printed, then show a table with the values
		System.out.println("Welcome to Pi approximator! Pi is actually " + Math.PI);	
		System.out.println("Number of throws\tPi Estimate\tDistance from Real Pi");
		System.out.printf("100\t\t\t" + "%8f" + "\t" + "%8f" +"\n", piHundred, diffHundred);
		System.out.printf("1000\t\t\t" + "%8f" + "\t" + "%8f" + "\n", piThousand, diffThousand);
		System.out.printf("10000\t\t\t" + "%8f" + "\t" + "%8f", piTenThousand, diffTenThousand);
	} // end main
	// This method generates a random number
	public static double gen() {
		return Math.random() * 2 - 1;
	} // end gen
	// This method checks if the ordered pair is inside the circle using the inequality x^2 + y^2 < 1.
	public static boolean isInside(double x, double y) {
		boolean inside = ((Math.pow(x, 2) + Math.pow(y, 2)) < 1);
		return inside;
	} // end isInside
	// this method contains the loop that generates 100, 1000, and 10000 ordered pairs and counts the number inside
	public static double countHits(int dartCount) {
		double x = gen(); // sets an initial random ordered pair
		double y = gen();
		int i = 0; // sets the initial counter and hit counter
		int hitCount = 0;
		// while loop to generate and count hits
		while(i < dartCount) {
			if(isInside(x, y)) { // if the ordered pair is in the circle
				hitCount++;
			} // end if
			x = gen(); // regenerates an ordered pair
			y = gen();
			i++;
		}  // end while
		return hitCount;
	} // end countHits
	// method approximates pi by dividing hits by misses
	public static double calcPi(double hc, int dc) {
		double pi = hc/(dc-hc);
		return pi;
	} // end calcPi
} // end class
