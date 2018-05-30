public class Numbers {

	public static void main(String[] args) {
		 
		double fahrenheit = 212;
		double celsius = 0;
		celsius = 5.0/9 * fahrenheit - 160.0/9;
		 System.out.println("fahrenheit " + fahrenheit + " becomes celsius " + celsius);
		 fahrenheit = 9.0/5 * (celsius + 160.0/9);
		 System.out.println("celsius " + celsius + " becomes fahrenheit " + fahrenheit);
	}

}
