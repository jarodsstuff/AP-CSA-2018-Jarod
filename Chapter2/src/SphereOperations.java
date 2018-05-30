// Jarod Reichel
// January 29, 2018
// AP CSA

import java.util.Scanner;

public class SphereOperations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of your sphere as a double: ");
		double radius = input.nextDouble();
		
		System.out.println("Radius is " + radius);
		System.out.println("Diameter is " + diameter(radius));
		System.out.println("Circumference is " + circum(radius));
		System.out.println("Surface area is " + surface(radius));
		System.out.println("Volume is " + vol(radius));
		
		input.close();
	}
	public static double diameter(double r) {
		return 2 * r;
	}
	public static double circum(double r) {
		double c = 2 * r * Math.PI;
		return c;
	}
	public static double surface(double r) {
		double sa = 4 * Math.PI * (r * r);
		return sa;
	}
	public static double vol(double r) {
		double v = (4.0 / 3.0) * Math.PI * (r * r * r);
		return v;
	}
}
