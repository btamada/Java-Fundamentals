package adddigits;

import java.util.LinkedList;

public class AddDigits {

	// new comment
	public static void main(String[] args) {
		int num = 38; 
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while(num > 0) {
			stack.add(num % 10);
			num /= 10;
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
