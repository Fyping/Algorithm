package algorithm.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_4 {

	/**
	 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

    Each integer is in the inclusive range .

Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5

Sample Output

10 14

Explanation

Our initial numbers are , , , , and . We can calculate the following sums using four of the five integers:

    If we sum everything except , our sum is .
    If we sum everything except , our sum is .
    If we sum everything except , our sum is .
    If we sum everything except , our sum is .
    If we sum everything except , our sum is .

As you can see, the minimal sum is and the maximal sum is . Thus, we print these minimal and maximal sums as two space-separated integers on a new line.

Hints: Beware of integer overflow! Use 64-bit Integer.

	 */
	
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long minSum=0,maxSum=0;
        Arrays.sort(arr);
        for(int i=1;i<5;i++){
        	maxSum+=arr[i];
        }
        for(int i=0;i<4;i++){
        	minSum+=arr[i];
        }
      //  System.out.println("minSum=="+minSum+"  maxSum=="+maxSum);
        System.out.println(minSum+" "+maxSum);
        
    }
    
    
}
