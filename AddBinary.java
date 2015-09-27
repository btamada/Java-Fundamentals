package interview_questions;

public class AddBinary {
	/*
	 * Add 2 binary strings and return a binary result
	 */
	private static String addBinary(String s1, String s2) {
	    // get the lengths of each string
		// create a variable to keep track of the carry bit
		int i = s1.length() - 1, j = s2.length() - 1, c = 0;
		
		// the resulting string
	    String s = "";

	    // loop through the string until either i < 0, j < 0, or c == 1
	    while (i >= 0 || j >= 0 || c == 1) {
	    	
	    	// if i < 0 then return 0 else return 1/0 - 0 == 1/0
	        int a = (i < 0) ? 0 : s1.charAt(i--) - '0';
	        
	        // if j < 0 then return 0 else return 1/0 - 0 == 1/0
	        int b = (j < 0) ? 0 : s2.charAt(j--) - '0';
	        
	        // calculate the XOR of 0 + a XOR b XOR c)
	        // save the result in the String "s"
	        s = (char)('0' + a ^ b ^ c) + s;
	        
	        // sum up a, b, and c and shift the bits to the right 1
	        // save the result in the integer variable "c"
	        c = (a + b + c) >> 1;
	    }
	    System.out.println(s);
	    return s;
	}
}
