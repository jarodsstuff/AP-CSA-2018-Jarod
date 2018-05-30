
public class StringExample4 {

	public static void main(String[] args) {
		String s1 = "Jarod Reichel was born on July 21, 2001.";
		String s2 = s1.toLowerCase();
		String s3 = "Mary Grace Reichel was born April 14, 2003.";
		String yelling = s3.toUpperCase();
		
		System.out.println("s1 = " + s1);
		System.out.println("Index of R = " + s1.indexOf('R'));
		System.out.println("Index of 2001 = " + s1.indexOf("2001"));
		System.out.println("Index of z = " + s1.indexOf('z'));
		System.out.println("Index of o = " + s1.lastIndexOf('o'));
		System.out.println("s2 = " + s2);
		if (s2.equals(s1))
			System.out.println("s1 is the same as s2");
		else if (s2.equalsIgnoreCase(s1))
			System.out.println("s1 is the same as s2 but with different capitalization");
		else
			System.out.println("s1 is not equal to s2");
		System.out.println("s3 = " + s3);
		System.out.println("s1 and s3 have a difference of " + s3.compareTo(s1));
		System.out.println("s3 and s1 have a difference of " + s1.compareTo(s3));
		System.out.println("s1 and s2 have a difference of " + s2.compareToIgnoreCase(s1));
		System.out.println("The LOUD (Uppercase) version of s3 = " + yelling);
		System.out.println("s3 trimmed is " + s3.trim());
		System.out.println("s3 with letters replaced = " + s3.replace('a', 'x'));
	}

}
