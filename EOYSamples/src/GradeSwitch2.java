
public class GradeSwitch2 {

	public static void main(String[] args) {
		int numGrade = 74;
		switch(numGrade/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("F");
		}
		
		
	}

}
