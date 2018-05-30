// class CircleTest is the driver program

public class CircleTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(10);
		System.out.println("Radius1 = " + circle1.getRadius() + " Diameter = " + circle1.getDiameter());
		System.out.println("Radius2 = " + circle2.getRadius() + " Diameter = " + circle2.getDiameter());
	} // end main

} // end class CircleTest
