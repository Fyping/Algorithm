package LintCode;

public class Solution_15 {

	/**
	 * 奇偶分割数组 
	 * 分割一个整数数组，使得奇数在前偶数在后。
	 * 给定 [1, 2, 3, 4]，返回 [1, 3, 2, 4]。
	 */
	
	/**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
    	int len =nums.length;
    	for(int i=0,j=len-1;i<j;){
    		if(nums[i]%2==0){
    			
    		}else{
    			i++;
    			continue;
    		}
    		if(nums[j]%2==1){
    			
    		}else{
    			j--;
    			continue;
    		}
    		int temp=nums[i];
    		nums[i]=nums[j];
    		nums[j]=temp;
    		
    	}
    }
    public static void main(String [] args){
    	int nums[]={1,2,3,5};
    	(new Solution_15()).partitionArray(nums);
    	for(int i=0;i<nums.length;i++){
    		System.out.println(nums[i]);
    	}
    }
}
