// Java program for implementation of Selection Sort
public class SelectionSort
{
	// method doSelectionSort contains the actual algorithm
	public static int[] doSelectionSort(int[] arr){
		
	    for (int i = 0; i < arr.length - 1; i++)
	    {
	        int index = i;
	        for (int j = i + 1; j < arr.length; j++)
	        	// checks if current number is greater than the one in the starting position
	            if (arr[j] < arr[index]) 
	                index = j;
	        // the next three lines swap the elements.
	        int smallerNumber = arr[index];  
	        arr[index] = arr[i];
	        arr[i] = smallerNumber;
	    } // end for
	    return arr;
	} // end doSelectionSort
	
	public static void main(String args[]){
		
		int[] arr1 = {10,34,2,56,7,67,88,42};
		int[] arr2 = doSelectionSort(arr1);
		// enhanced for to print out the elements
		for(int i:arr2){
			System.out.print(i);
			System.out.print(", ");
		}
	} // end main
}