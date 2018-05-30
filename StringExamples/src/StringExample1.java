
public class StringExample1 {

	public static void main(String[] args) {
		String name1 = new String("Alex");
		String name2 = new String("Grace");
		String name3 = new String("Christopher");
		String name4 = new String("Jarod");
		int len1 = name1.length();
		int len2 = name2.length();
		int len3 = name3.length();	
		int len4 = name4.length();
		int mid3 = name3.length() / 2;
		int mid4 = name4.length() / 2;
		
		System.out.println(name4.substring(mid4 + 1) + name4.substring(0, mid4 + 1));
		
		for(int i = 0; i < name4.length(); i++)
			System.out.println(name4.substring(i, i+1));
	}

}
