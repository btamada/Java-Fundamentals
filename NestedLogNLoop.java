
public class NestedLogNLoop {
	
	/*
	 * Try different kinds of nested for loops
	 * 
	 * Outer Loop: O(n)
	 * Inner Loop: O(logn)
	 */
	public static void main(String[] args) {
		for(int i = 0; i <= 8; ++i) {
			System.out.println("Iteration #"+i);
			for(int j = 1; j <= i; j *= 2) {
				System.out.print("i: " + i + " ");
				System.out.println("j: " + j);
			}
		}
	}

}
