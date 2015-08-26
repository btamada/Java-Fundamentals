package mergesort;

public class MergeSort {
	
	/*
	 * @param - integer array to sort
	 * A helper array that will be used for sorting
	 * The mergesort method takes in the integer array, helper array, starting index and ending index 
	 */
	public void mergesort(int[] array) {
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length - 1);
	}
	
	/*
	 * @param array - integer array to sort through
	 * @param helper - helper array to help sort the integer array
	 * @param low - the starting index of the array
	 * @param high - the ending index of the array
	 * 
	 * A recursive function that repeatedly divides the left half of the array
	 * and repeatedly divides the right half of the array until we are left with
	 * 1 or 2 elements.  Then we sort the fragmented subarrays into a single array
	 * again.  The result is a single array that is completely sorted.
	 * 
	 * Time: O(n)
	 * Space: O(n)
	 */
	private void mergesort(int[] array, int[] helper, int low, int high) {
		if(low < high) {
			int middle = (low + high) / 2;
			
			System.out.println("Calling First Merge Sort");
			System.out.println(low + " " + middle + " " + high);
			mergesort(array, helper, low, middle);
			
			System.out.println("Calling Second Merge Sort");
			System.out.println(low + " " + (middle + 1) + " " + high);
			mergesort(array, helper, middle+1, high);
			
			System.out.println("Calling Merge");
			System.out.println(low + " " + middle + " " + high);
			
			merge(array, helper, low, middle, high);
		}
	}
	
	/*
	 * Time: O(logn)
	 * Space: O(n)
	 */
	private void merge(int[] array, int[] helper, int low, int middle, int high) {
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;
		
		while(helperLeft <= middle && helperRight <= high) {
			if(helper[helperLeft] <= helper[helperRight]) {
				array[current] = helper[helperLeft];
				//System.out.println(array[current]);
				helperLeft++;
			} else {
				array[current] = helper[helperRight];
				//System.out.println(array[current]);
				helperRight++;
			}
			current++;
		}
		
		int remaining = middle - helperLeft;
		for(int i = 0; i <= remaining; i++) {
			array[current + i] = helper[helperLeft + i];
		}
		
		for(int i = 0; i <=  high; i++){
			System.out.println(array[i]);
		}
	}
}
