
public class Bakery {
	private String name;
	private double cost;
	private int calories;
	private int numOfCookies;

	public Bakery(String theName, double theCost, int calorieCount, int cookieCount) {
		name = theName;
		cost = theCost;
		calories = calorieCount;
		numOfCookies = cookieCount;
	}
	public String getName() {
		return name;
	}
	public double getCost() {
		return cost;
	}
	public int getCalories() {
		return calories;
	}
	public int getCount() {
		return numOfCookies;
	}
	public double getTotal() {
		return cost * numOfCookies;
	}
}
