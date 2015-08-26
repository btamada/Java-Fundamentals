package permutation;

public class Permutation {

	private static void permute(char[] arr, int left, int right) {
		// beginning or end of the permutation
		if(left == right) {
			return;
		} else {
			for(int i = left; i < right; i++) {
				swap(arr, left, i);
				permute(arr, left+1, i);
				swap(arr, left, i);
			}
		}
	}
	
	private static void swap(char[] arr, int left, int right) {
		char temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public static void main(String[] args) {
		char[] arr = "123".toCharArray();
		int length = arr.length;
		permute(arr, 0, length);

	}

}
