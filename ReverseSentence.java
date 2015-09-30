
public class ReverseSentence {

	
	/* 
	 * Reverse the words in the character array for n number of words
	 * 
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 */
	public static void main(String[] args) {
		char[] source = {
				'p','e','r','f','e','c','t',' ',
				'm','a','k','e','s',' ',
				'p','r','a','c','t','i','c','e'
				};
		char[] destination = new char[source.length];
		int previous = source.length;
		int destination_index = 0;
		
		for(int i = source.length-1; i >= 0; i--) {
			if(source[i] != ' ' && i > 0) continue;
			
			int j = (i == 0) ? i : i+1;
			
			for(; j < previous; j++) {
				destination[destination_index++] = source[j];
			}
			
			if(i != 0) destination[destination_index++] = ' ';
			
			previous = i;
		}
		
			
		// print out the destination array
		for(int i = 0; i < destination.length; ++i) {
			System.out.println(destination[i]);
		}
		
	}

}
