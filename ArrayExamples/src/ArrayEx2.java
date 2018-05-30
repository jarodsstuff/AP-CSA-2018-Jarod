
public class ArrayEx2 {

	public static void main(String[] args) {
		int[] scores = {70, 85, 85, 87, 89};
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == scores[i+1]) {
				System.out.println("Equal elements at " + i + " and " + (i+1));
			} else {
				System.out.println("Not equal at " + i + " and " + (i+1));
			}
			
		}

	}

}
