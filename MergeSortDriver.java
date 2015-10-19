package mergesort;

public class MergeSortDriver {

	public static void main(String[] args) {
		int[] integers = {3,2,1,4};
		MergeSort ms = new MergeSort();
		ms.mergesort(integers);
	}
	
	private static void print(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
