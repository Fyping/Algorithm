package algorithm.warmup;

import java.util.Scanner;

public class Solution_2 {
	/**
	 * Diagonal Difference
	 * Given a square matrix of size N * N  , calculate the absolute difference between the sums of its diagonals.

		Input Format

		The first line contains a single integer, . The next lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

	Output Format

	Print the absolute difference between the two sums of the matrix's diagonals as a single integer.


	 *
	 */
	static private int solve(int a[][],int n){
		int leftCount = 0,rightCount = 0;
		for(int i=0,leftIndex=0,rightIndex=n-1;i<n;i++,leftIndex++,rightIndex--){
			leftCount+=a[i][leftIndex];
			rightCount+=a[i][rightIndex];
		}
		if(leftCount>rightCount){return leftCount-rightCount;}else{
			return rightCount-leftCount;
		}
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = Solution_2.solve(a, n);
        System.out.println(result);
    }
	
}
