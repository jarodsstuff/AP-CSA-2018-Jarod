
public class ArrayEx1 {
	public static void swap(int[] x, int i, int j) {
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}
	public static void main(String[] args) {
		int[] scores = {95, 97, 79, 99, 100};
		swap(scores, 0, scores.length - 1);
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
				
		} // for print scores

	} // end main

} // end class
