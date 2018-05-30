// class creating Object Circle
public class Circle {
	private double radius; // instance variable
	
	// a constructor creates the circle.
	// no-argument or default constructor.
	
	public Circle() {
		// radius set to zero
	} // end default constructor
	
	// Parameterized constructor
	public Circle(double rad) {
		radius = rad;
	}
	public double getRadius() { // accessor method
		return radius;
	} // end getRadius accessor method
	public double getDiameter() { // accessor method returns diameter
		return radius * 2;
	}
} // end class Circle
