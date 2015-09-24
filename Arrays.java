package interview_questions;

public class Arrays {

	public static void main(String[] args) {
		int[] integers = {9,1,7,3,5,0,2,8,4,6};
		kthLargest(integers);
		System.out.println(kthElement(integers, 1));
	}

	private static void print(int[] integers, int length) {
		for(int i = 0; i < length; ++i) {
			System.out.println(integers[i]);
		}
	}
	
	/*
	 * Kth largest elements in an array
	 * Time: O(n)
	 * Space: O(n)
	 */
	private static void kthLargest(int[] integers) {
		if(integers.length <= 0) return;
		
		//sort the array from smallest -> largest
		for(int i = 0; i < integers.length; ++i) {
			for(int j = 0; j < integers.length; ++j) {
				if(integers[i] > integers[j]) {
					swap(integers, i, j);
				}
			}
		}
		
		// return the kth largest elements in the array
		print(integers, 3);
	}
	
	/*
	 * Kth element in an array
	 * Time: O(n)
	 * Space: O(n)
	 */
	private static int kthElement(int[] integers, int kthElement) {
		if(integers.length <= 0) return -1;
		
		//sort the array from smallest -> largest
		for(int i = 0; i < integers.length; ++i) {
			for(int j = 0; j < integers.length; ++j) {
				if(integers[i] > integers[j]) {
					swap(integers, i, j);
				}
			}
		}
		
		// return the kth largest elements in the array
		return integers[kthElement];
	}
	
	/*
	 * Multiple without using the * character
	 */
	private static int multiply(int a, int b) {
		int result = 0;
		while(b > 0) {
			result += a;
			--b;
		}
		return result;
	}
	
	
	/*
	 * Divide without using the / character
	 */
	private static int divide(int a, int b) {
		int result = 0;
		while(b > 0) {
			result += 1;
			b -= a;
		}
		return result;
	}
	
	/*
	 * Sort the integers array so that odd #s are
	 * on the left and even numbers are on the right
	 */
	private static void evenOdd(int[] integers) {
		int counter = integers.length-1;
		for(int i = 0; i < integers.length/2; ++i) {
			if(integers[i] % 2 != 0) continue;
			while(integers[counter] % 2 == 0) {
				--counter;
			}
			swap(integers, i, counter);
		}
	}
	
	private static void swap(int[] integers, int a, int b) {
		int tmp = integers[a];
		integers[a] = integers[b];
		integers[b] = tmp;
	}
	
	/*
	 * Sort the integers array so that odd #s are
	 * on the left and even numbers are on the right
	 */
	private static void oddEven(int[] integers) {
		int counter = integers.length-1;
		for(int i = 0; i < integers.length/2; ++i) {
			if(integers[i] % 2 == 0) continue;
			while(integers[counter] % 2 != 0) {
				--counter;
			}
			swap(integers, i, counter);
		}
	}
	
}
