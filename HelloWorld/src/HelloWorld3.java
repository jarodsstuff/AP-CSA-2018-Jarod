import java.util.Scanner;

public class HelloWorld3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();
		
		System.out.println("Hello, " + firstName + " " + lastName);
		System.out.println("Welcome to Java!");
		
		input.close();
	}

}
