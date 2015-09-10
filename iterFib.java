package iterfib;

public class iterFib {

	public iterFib() {};
	
	public long iterFib(long num) {
		int prev1 = 1;
		int prev2 = 1;
		int current = 2;
		int next = 0;
		
		if(num == 0 || num == 1) {
			return 1;
		} else {
			for(int i = 2; i < num; ++i) {
				current = prev1 + prev2;
				next = current + prev2;
				prev1 = prev2;
				prev2 = current;
			}
		}
		
		return next;
	}

}
