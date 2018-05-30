
public class StringExample3 {

	public static void main(String[] args) {
		String s1 = "banana";
		String s2 = "avocado";

		if(s2.equals(s1))
			System.out.println(s2 + "\t" + s1);
		else if(!s2.equals(s1))
			System.out.println(s1 + "\t" + s2);
		else
			System.out.println("Same word");
	}

}
