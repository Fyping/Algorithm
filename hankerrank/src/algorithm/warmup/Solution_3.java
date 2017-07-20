package algorithm.warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_3 {

	/**
	 * Plus Minus
	 * 
	 * Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
	 * 
	 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to are acceptable.
	 * 
	 * Input Format

	 * The first line contains an integer,N , denoting the size of the array.
	 * The second line contains N space-separated integers describing an array of numbers
	 * 
	 * a0 ,a1,a2,a3,a4,a5,a6,a7......an-1
	 * 
	 * Output Format

	 * You must print the following lines:

     * A decimal representing of the fraction of positive numbers in the array compared to its size.
     * A decimal representing of the fraction of negative numbers in the array compared to its size.
     * A decimal representing of the fraction of zeroes in the array compared to its size.

	 *  
	 *  
	 *  Sample Input

		6
		-4 3 -9 0 4 1         
		
		Sample Output
		
		0.500000
		0.333333
		0.166667
		
		Explanation
		
		There are positive numbers, negative numbers, and zero in the array. 

	 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        ArrayList<Float> result = new ArrayList<Float>();
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0){
            	result.add((float) (arr[arr_i]*1.0/n));
            }
        }
        for(float temp:result){
        	System.out.printf("%.6f\n",temp);
        }
    }
}
