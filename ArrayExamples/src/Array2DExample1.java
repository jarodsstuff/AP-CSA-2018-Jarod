
public class Array2DExample1 {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3, 1337, 999},{4, 5, 6}, {7, 8, 9}, {10, 11, 12, 666}, {13, 14, 15}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "     ");
			}
			System.out.print("\n");
		}
	}

}
