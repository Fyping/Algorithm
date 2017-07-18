package LintCode;

import java.util.Arrays;

public class Solution_14 {

	/**
	 * 背包问题 VI 
	 * 
	 * 给出一个都是正整数的数组 nums，其中没有重复的数。从中找出所有的和为 target 的组合个数。
	 * 给出 nums = [1, 2, 4], target = 4
	 * 可能的所有组合有：
	 * [1, 1, 1, 1]
	 * [1, 1, 2]
	 * [1, 2, 1]
	 * [2, 1, 1]
	 * [2, 2]
	 * [4]
	 * 
	 * 返回 6
	 * */
	
	
	
    /**
     * @param nums an integer array and all positive numbers, no duplicates
     * @param target an integer
     * @return an integer
     */
	private int re = 0;
    public int backPackVI(int[] nums, int target) {    
    	int[] dp = new int[target+1];
	    dp[0] = 1;
	    for (int i = 1; i <= target; i++) {
	        for (int num: nums) {
	            if (num <= i) dp[i] += dp[i-num];
	        }
	    }
	    return dp[target];
    }
    
    public static void main(String[] args) {
		int nums[] = {1,2,4};
		int target = 4;
		
		System.out.println((new Solution_14()).backPackVI(nums, target));
	}
    
}
