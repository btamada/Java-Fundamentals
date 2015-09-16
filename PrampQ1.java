
public class PrampQ1 {

	/*
	 * Create an algorithm that multiplies all elements in the array
	 * except the current iteration and return the results into an array
	 * 
	 * Give the optimized solution with the following complexities:
	 * Time: O(n)
	 * Space: O(n)
	 */
	public static void main(String[] args) {
		int[] arr = {1,1,2,2};
		int length = arr.length;
		int[] result = new int[length];
			
		
		// initialize all elements in result array to 1			
		for(int i = 0; i < length; ++i) {
			result[i] = 1;
		}
		
		// iterate forward through the array and calculate the products
		// store the results into the results array
		int product = 1;
		for(int i = 0; i < length; ++i) {
			result[i] *= product;
			//System.out.println("Result array: " + result[i]);
			product *= arr[i];
			//System.out.println("Product: " + product);
		}
		
		// iterate backwards through the array and calculate the products
		// store the results into the results array
		product = 1;
		for(int i = length-1; i >= 0; --i) {
			result[i] *= product;
			//System.out.println("Result array: " + result[i]);
			product *= arr[i];
			//System.out.println("Product: " + product);
		}
		
		// print out the results
		for (int ans : result) {
			System.out.print(ans + " -> ");
		}
	}

}

/*
 * [2,2,7,4]
 * 
 * result = [2*7*4, 2*7*4, 2*2*4, 2*2*7]
 * 
 *  
 */