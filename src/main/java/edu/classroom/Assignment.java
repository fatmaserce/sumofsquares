package edu.classroom;

/**
 * Implement sumOfSquares(int n):
 * Returns 1^2 + 2^2 + ... + n^2.
 * For n <= 0, return 0.
 */
public class Assignment {
    public static int sumOfSquares(int n) {
    	if(n <= 0) return 0;
	int sum = 0;
	for(int i = 1; i <= n ; i++){
	   sum += i * i;
	}

	return sum;
    }
}
