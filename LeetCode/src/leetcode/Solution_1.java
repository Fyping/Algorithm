package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.IdentityHashMap;
public class Solution_1 {
	public Solution_1(){}
    public int[] twoSum(int[] nums, int target) {
        int result[] ={0,0};
        IdentityHashMap<Integer,Integer> hashnums = new IdentityHashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            hashnums.put(nums[i],i);            
        }
        
        Arrays.sort(nums);
        int tip=nums.length-1;
        for(int i=0;i<hashnums.size();i++){
        	System.out.println(hashnums.get(nums[i]));
        }
        //0 1 2 3 4 5  6 7 8 9 10
        out:for(int i=0;i<nums.length;i++){
            for(int j=tip;j>=0;j--){
                if(i==j){continue;}
                if(target==nums[i]+nums[j]){
                    result[0]=hashnums.get(nums[i]);
                    result[1]=hashnums.get(nums[j]);
                    break out;
                }
            }
            if(nums[i]+nums[tip]>target){
                tip--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
    	int [] num = {3,3};
    	int tar = 6;
    	
		int result[] = (new Solution_1()).twoSum(num,tar);
		System.out.println(" --------------  ");
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
		
    }
}