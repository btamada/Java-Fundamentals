package stack;

public class StackDriver {

	public static void main(String[] args) {
		Stack stack = new Stack();
		if (stack.isEmpty()) {
			stack.push("John");
			stack.push("Jane");
			stack.push("Henry");
			stack.push("Jerry");
			stack.push("Susy");
			stack.push("Larry");
			stack.print();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		}
	}

}
