package LintCode;

import java.util.Arrays;

public class Solution_14 {

	/**
	 * �������� VI 
	 * 
	 * ����һ������������������ nums������û���ظ������������ҳ����еĺ�Ϊ target ����ϸ�����
	 * ���� nums = [1, 2, 4], target = 4
	 * ���ܵ���������У�
	 * [1, 1, 1, 1]
	 * [1, 1, 2]
	 * [1, 2, 1]
	 * [2, 1, 1]
	 * [2, 2]
	 * [4]
	 * 
	 * ���� 6
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
