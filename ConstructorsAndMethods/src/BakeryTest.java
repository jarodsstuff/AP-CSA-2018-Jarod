
public class BakeryTest {

	public static void main(String[] args) {
		Bakery chocoChip = new Bakery("Chocolate Chip", 2.19, 125, 2);
		System.out.println("Type of cookie is: " + chocoChip.getName());
		System.out.println("Cost per cookie is: " + chocoChip.getCost());
		System.out.println("The number of calories is: " + chocoChip.getCost());
		System.out.println("You ordered " + chocoChip.getCount() + " Cookies.");
		System.out.println("Your total cost is: " + chocoChip.getTotal());
	}

}
