
public class RemoveDuplicates {

	public static void main(String[] args) {
		
		/*
		 * Remove duplicates in the integer array
		 * 
		 * Rules:
		 * > Do not use extra space
		 * > Move all unique integers to the front of the array
		 */
		
		int[] integers = {1,3,5,4,5,3,1,1,0};
		
		int pointer = 0;
		
		for(int i = 0; i < integers.length; ++i) {
			
			for(int j = i+1; j < integers.length; ++j) {
				
				// skip to the next iteration for any elements that are -1
				if(integers[j] == -1) continue;
				
				// check for duplicates and set the duplicate to -1
				if(integers[i] == integers[j]) {
					
					integers[j] = -1;
				}
				
				while(pointer < integers.length) {
					if(integers[pointer] != -1) swap(integers, pointer, j);
					++pointer;
				}
				
			}
			
		}
		
		for(int k = 0; k < integers.length; ++k) {
			System.out.print(integers[k] + " -> ");
		}
	}
	
	private static void swap(int[] arr, int ptr1, int ptr2) {
		int tmp = arr[ptr1];
		arr[ptr1] = arr[ptr2];
		arr[ptr2] = tmp;
	}
}
