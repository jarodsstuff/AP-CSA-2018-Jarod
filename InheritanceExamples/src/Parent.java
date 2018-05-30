
public class Parent {
	public String name;
	public int age;
	
	public Parent() {
		name = "Dad";
		age = 40;
	}
	public Parent(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
