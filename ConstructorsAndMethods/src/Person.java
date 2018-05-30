
public class Person {
	private String firstName;
	private String lastName;
	private String birthDate;
	private int age;
	
	public Person(String first, String last, String bDate, int theAge) {
		firstName = first;
		lastName = last;
		birthDate = bDate;
		age = theAge;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public int getAge() {
		return age;
	}
}
