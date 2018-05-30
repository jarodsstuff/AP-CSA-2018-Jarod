
public class B extends A {
	private int value;
	public B() {
		super();
		System.out.println("B's no arg constructor is invoked");
	}
	public B(int num) {
		value = num;
	}
	public int getValue() {
		return value;
	}
}
