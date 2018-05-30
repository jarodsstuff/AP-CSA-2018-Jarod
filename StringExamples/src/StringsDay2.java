
public class StringsDay2 {

	public static void main(String[] args) {
		String backStr = "";
		String str = "Omae wa mou shindeiru";
		int len = str.length();
		for(int i = len - 1; i >= 0; i--) {
			backStr += str.charAt(i);
		}
		System.out.println(backStr);
		if (str.equals(backStr)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
