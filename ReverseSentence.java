
public class ReverseSentence {

	
	/* 
	 * Reverse the words in the character array for n number of words
	 * 
	 * Time Complexity: O(n^2)
	 * Space Complexity: O(n)
	 */
	public static void main(String[] args) {
		char[] arr = {
				'p','e','r','f','e','c','t',' ',
				'm','a','k','e','s',' ',
				'p','r','a','c','t','i','c','e'
				};
		char[] result = new char[arr.length];
		int arrLength = arr.length-1;
		int resultLength = result.length;
		int resultIndex = 0;
		
		// start at the end of the array
		int firstLetterIndex = arrLength;
		int lastLetterIndex = arrLength;
		
		for(int i = arrLength; i >= 0; --i) {
			if(arr[i] == ' ') {
				
				//System.out.println("We found a space");
								
				firstLetterIndex = i + 1;
				
				for(int j = firstLetterIndex; j <= lastLetterIndex; ++j) {
					result[resultIndex++] = arr[j];
				}
				result[++resultIndex] = ' ';
				resultIndex += 1;
				
				
			} else if(i == 0) {
				
				//System.out.println("We found the beginning");
				
				
				firstLetterIndex = 0;
				
				// copy the rest of the characters into the result array
				for(int k = firstLetterIndex; k <= lastLetterIndex; ++k) {
					result[resultIndex++] = arr[k];
				}
				
				
			}
			
			// update the last letter index
			lastLetterIndex = i - 1;
		}
		
		// print out the result array
		for(int i = 0; i < resultLength; ++i) {
			System.out.println(result[i]);
		}
		
	}

}
