package watertrap;

public class Watertrap {

	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		int length = arr.length;
		findWater(arr, length);

	}
	
	private static int findWater(int[] arr, int n) {
		// array that holds the left biggest numbers 
		int[] left = new int[n];
		
		// array that holds the right biggest numbers
		int[] right = new int[n];
		
		// holds the total amount of water
		int water = 0;
		
		// this will contain the first element of the array "arr" i.e. 0
		left[0] = arr[0];
		
		// loop forwards through and compare the element in the "left" array with
		// the element in the "arr" array and find the max of these two numbers
		for(int i = 1; i < n; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
			//System.out.println(left[i]);
		}
		
		//System.out.println("");
		
		// contains the last element of the array "arr" i.e. 1
		right[n-1] = arr[n-1];
		
		// loop backwards through and compare the element in the "right" array with
		// the element in the "arr" array and find the max of these two numbers
		for(int i = n-2; i >= 0; i--) {
			right[i] = Math.max(right[i+1],arr[i]);
			//System.out.println(right[i]);
		}
		
		// loop through all 3 arrays "left," "right," and "arr"
		// and find the min of the element in "left" and "right" and
		// subtract it from the element in "arr" array to determine if
		// there is water that can fit in between these columns
		// if so, then increment the water variable by that number to find the total
		for(int i = 0; i < n; i++) {
			water += Math.min(left[i],right[i]) - arr[i];
		}
		
		// print out the result to console and return the result
		System.out.println(water);
		return water;
	}

}
