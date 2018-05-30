public class Parent implements Interface1 {
	
	public String name;
	public int age;
	
	public Parent(){
		this("Dad", 40);
	}
	
	public Parent( String n, int a ){
		name = n;
		age = a;
	}
	public int ageInMonths() {
		return age * 12;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

}