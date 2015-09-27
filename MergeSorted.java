package interview_questions;

public class MergeSorted {
	/*
	 * Merge 2 sorted arrays into a single sorted array
	 */
	private static int[] mergeSorted(int[] nums1, int[] nums2) {
		// check if the given arrays are empty
		if(nums1.length == 0 || nums2.length == 0) return null;
		
		int min = nums1.length < nums2.length ? nums1.length : nums2.length;
		
		// create a new array to store the sorted arrays
		int[] result = new int[nums1.length+nums2.length];
		
		int i = 0, j = 0, counter = 0;
		
		while(i < min) {
			if(nums1[i] < nums2[j]) {
				result[counter++] = nums1[i];
				++i;
			} else if (nums1[j] > nums2[j]) {
				result[counter++] = nums2[j];
				++j;
			} else {
				result[counter++] = nums1[i];
				result[counter++] = nums2[j];
				++i;
				++j;
			}
		}
		
		while(j < nums2.length) {
			result[counter++] = nums2[j++];
		}
		
		return result;
	}
}
