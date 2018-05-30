
public class LoopExample1 {

	public static void main(String[] args) {
		for( int i = 2; i <= 150; i = i + 2) { //i--
			System.out.printf("%d ", i);
		}
		System.out.println();
		for( int i = 150; i >= 2; i = i - 2) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		for( int i = 3; i <= 225; i = i + 3 ) {
			System.out.printf("%d ", i);
		}
	} // end main

} // end class LoopExample1
