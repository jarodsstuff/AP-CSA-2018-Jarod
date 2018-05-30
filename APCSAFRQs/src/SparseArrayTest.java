
public class SparseArrayTest {

	public static void main(String[] args) {
		SparseArray arr = new SparseArray();
		arr.add(1,4,4);
		arr.add(2, 0, 1);
		arr.add(3, 1, -9);
		arr.add(1, 1, 5);
		System.out.println(arr.toString() );
		System.out.println(arr);
		arr.removeColumn(1);
		System.out.println(" ------------------ ");
		System.out.println(arr.toString());
	}

}
