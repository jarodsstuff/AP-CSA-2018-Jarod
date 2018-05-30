
public class PersonTest {

	public static void main(String[] args) {
		Person mrsViolett = new Person("Mrs.", "Violett", "Jan 1, 1800", 217);
		Person jarod = new Person("Jarod", "Reichel", "July 21, 2001", 16);
		
		System.out.println("Name is " + jarod.getFirstName() + " " + jarod.getLastName() + ", who was born on " + jarod.getBirthDate() + ", and is " + jarod.getAge() + " years old.");

	}

}
