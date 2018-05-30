import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] nums = {5, 7, 4, 3, 1};
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int guess = input.nextInt();
		boolean test = true;
		int index = 0;
		
		while(test) {
			if (guess == nums[index]) {
				System.out.println("index = " + index);
				
				test = false;
			} else {
				index++;
			}
			if (index > 4) {
				test = false;
				
			}
		}
		
		input.close();
	}

}
