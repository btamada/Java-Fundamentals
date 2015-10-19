package interview_questions;

public class SpiralMatrix {
	/*
	 * Create a matrix with elements in a clockwise, spiral direction
	 */
	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
	    if (n == 0) return result;
	    int row = 0, col = -1, m = n, count = 0;
	    
	    // keep in mind the break statements break out of the while loop
	    while (true) {
	        for (int i = 0; i < n; i++) result[row][++col] = ++count;
	        if (--m == 0) break;
	        for (int i = 0; i < m; i++) result[++row][col] = ++count;
	        if (--n == 0) break;
	        for (int i = 0; i < n; i++) result[row][--col] = ++count;
	        if (--m == 0) break;
	        for (int i = 0; i < m; i++) result[--row][col] = ++count;
	        if (--n == 0) break;
	    }
	    return result;
    }
}
