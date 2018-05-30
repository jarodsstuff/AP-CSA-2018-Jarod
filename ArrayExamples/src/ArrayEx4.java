import java.util.Random;

public class ArrayEx4 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] die = {0,0,0,0,0,0};
		for(int i = 1; i <= 10; i++) {
			int num1 = rand.nextInt(6) + 1;
			System.out.print(num1 + "    ");
		}
		
	}

}
