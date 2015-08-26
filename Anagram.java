package anagram;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Amazon";
		String s2 = "nozamA";
		
		// Check if s2 is an anagram contained in s1
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < c2.length; ++i) {
			for(int j = 0; j < c1.length; ++j) {
				if(c2[i] == c1[j]) {
					sb.append(c2[i]);
				}
			}
		}
		
		if(sb.toString().equalsIgnoreCase(s2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
