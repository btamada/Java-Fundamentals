import java.util.HashMap;

public class SmallestSubstring {

	/*
	 * Question:
	 * Given an array with unique characters arr and a string str,
	 * find the smallest substring of str containing all characters of arr.
	 * 
	 * Example:
	 * arr: [x,y,z], str: xyyzyzyx
	 * result: zyx
	 * 
	 * Target Time and Space Complexities:
	 * Time: O(n+m) -> iterate through the entirety of str and arr
	 * Space: O(m) -> iterate through the entirety of arr
	 */
	
	public static void main(String[] args) {
		char[] arr = {'x','y','z'};
		String str = "xyyzyzyx";
		String substring = getShortestUniqueSubstring(arr,str);
		System.out.println(substring);
	}
	
	private static String getShortestUniqueSubstring(char[] arr, String str) {
			
		/*
		 * TODO
		 * 1) Create a pointer that keeps track of the first unique character
		 * 2) Create a pointer that keeps track of the last unique character found
		 * 3) Iterate through "str" to search for a sequence of unique characters.
		 * 	  If we find a repeating character then reset the points and start all
		 * 	  over again until we either find the unique sequence of characters or
		 *    we iterate through all of the characters of "str."
		 * 4) Save the unique characters in the string "result"
		 * 5) If str.equalsIgnoreCase(result) then we found our substring and
		 *    we return it in the result variable or else we return null;
		 */
		if(arr == null || str == null || arr.length >= str.length()) return null;
		
		String result = null;
		int begIndex = 0;
		int endIndex = 0;
		int begCounter = 0;
		int endCounter = 0;
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		// Time O(m)
		// Space O(m)
		for(int i = 0; i < arr.length; i++) {
			hm.put(arr[i], 0);
		}
		
		// Time O(n)
		for(int i = 1; i < str.length(); i++) {
			/*
			 * Subtract consecutive characters to determine if they are the same
			 * value by checking if the result is equal to 0 (zero).  If so, then
			 * skip to the next iteration and increment the begIndex and endIndex
			 * pointers.
			 */
			
			if(str.charAt(begIndex) - str.charAt(endIndex) == 0) {
				begIndex = i;
				endIndex = ++i;
				continue;
			}
			
			begCounter = hm.get(str.charAt(begIndex));
			endCounter = hm.get(str.charAt(endIndex));
			
			if(begCounter == 0 && endCounter == 0) {
				hm.put(str.charAt(begIndex), 1);
				hm.put(str.charAt(endIndex), 1);
				++endIndex;
			} else {
				endCounter += hm.put(str.charAt(i), ++endCounter);
				if(endCounter > 1) {
					hm.put(str.charAt(i), 1);
					begIndex = i;
					endIndex = ++i;
				}
			}
			
			/*
			if(begCounter == 0) {
				hm.put(str.charAt(i), ++freqCounter);
				result += str.charAt(i);
				++endIndex;
			} else if(freqCounter == 1) {
				if(hm.get(str.charAt(begIndex)) == 1) hm.put(str.charAt(begIndex),0);
				if(hm.get(str.charAt(endIndex)) == 1) hm.put(str.charAt(endIndex),0);
				result = "" + str.charAt(i);
				begIndex = i-1;
				endIndex = i;
			} else {
				return null;
			}
			*/
		}
		
		return result.equalsIgnoreCase(str) ? result : null;
	}

}
