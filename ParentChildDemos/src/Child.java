
public class Child extends Parent{
	
	private String name;
	private int age;
	
	
	
	public Child(){
		this("Naomi", 15);
	}
	
	public Child( String n, int a ){
		name = n;
		age = a;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
}
