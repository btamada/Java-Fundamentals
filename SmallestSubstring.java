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
		 * 5) If result.equalsIgnoreCase(substring) then we found our substring and
		 *    we return it or else we return null;
		 */
		String result = null;
		int begIndex = 0;
		int endIndex = 0;
		int freqCounter = 0;
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		// Time O(m)
		// Space O(m)
		for(int i = 0; i < arr.length; i++) {
			hm.put(arr[i], 0);
		}
		
		// Time O(n)
		for(int i = 0; i < str.length(); i++) {
			freqCounter = hm.get(str.charAt(i));
			
			if(freqCounter == 0) {
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
		}
		
		return str.equalsIgnoreCase(result) ? result : null;
	}

}
