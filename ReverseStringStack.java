package interview_questions;

import java.util.Stack;

public class ReverseStringStack {
	/*
	 * Reverse words in a string using a stack
	 */
	private static void reverseString(String s, String delimiter) {
		
		// hold the strings
		Stack<String> stack = new Stack<>();
		
		// String array to hold the words
		String[] stringArray = s.split(delimiter);
		
		for(int i = 0; i < stringArray.length; ++i) {
			stack.push(stringArray[i]);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
}
