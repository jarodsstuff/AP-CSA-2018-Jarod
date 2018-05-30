
public class ParentTest {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		Parent p2 = new Parent("Bob", 42 );
		
		Child c1 = new Child();
		Child c2 = new Child( "Sally", 5 );
		
		Parent c3 = new Child();
		
		System.out.println("Parent NP: " + p1.getName() + " is " + 
							p1.getAge() + " years old\n" );
		System.out.println("Parent: " + p2.getName() + " is " + 
							p2.getAge() + " years old\n" );
		System.out.println("Child NP: " + c1.getName() + " is " + 
							c1.getAge() + " years old\n" );
		System.out.println("Child: " + c2.getName() + " is " + 
							c2.getAge() + " years old\n" );
		System.out.println("Child PC NP: " + c3.getName() + " is " + 
				c1.getAge() + " years old\n" );
		System.out.println("Age in months = " + p1.ageInMonths());
	}

}