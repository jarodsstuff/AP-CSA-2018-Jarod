
public class Child extends Parent {
	public int monthAge;
	
	
	public Child() {
		name = "";
		monthAge = 2;
	}
	public Child(String n, int m) {
		name = n;
		monthAge = m;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
