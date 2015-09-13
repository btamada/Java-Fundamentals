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
			
		if(arr == null || str == null || arr.length >= str.length()) return null;
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		char[] strCA = str.toCharArray();
		
		for(int i = 0; i < arr.length; ++i) {
			hm.put(arr[i], 0);
		}
		
		int strLength = str.length();
		
		int previous = 0;
		
		String result = "";
		
		for(int i = 0; i < strLength; ++i) {
			
			// if we find a character not in the hashmap then skip to the next iteration
			if(hm.get(strCA[i]) == null) continue;
			
			// if we find a character already in the hashmap then zero out our previous counters
			// in this case it would never be greater than 1 because we have a check here
			if(hm.get(strCA[i]) == 1) {
				
				// zero out the previous counters
				for(int j = previous; j < i; ++j) {
					hm.put(strCA[j], 0);
				}
				
				result = "";
				
				// we need to decide where to set the previous pointer
				// and how to set the result string
				if(strCA[i-1] == strCA[i]) {
					previous = i;
					result += Character.toString(strCA[i]);
				} else {
					previous = i-1;
					hm.put(strCA[previous],1);
					result += Character.toString(strCA[previous]);
				}
			}
			
			// if the character value is 0...
			// increment the the associated key's value in the hashmap
			hm.put(strCA[i], 1);
			
			// add the character to our result string
			result += strCA[i];
		}
		
		// do a last check if the result is the same as the unique characters in our array
		return result;
	}

}
