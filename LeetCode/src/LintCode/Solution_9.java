package LintCode;

import java.util.Arrays;

public class Solution_9 {

	/**
	 * 
	 * 删除元素
	 * 给出一个数组 [0,4,4,0,0,2,4,4]，和值 4
	返回 4 并且4个元素的新数组为[0,0,0,2]
	给定一个数组和一个值，在原地删除与值相同的数字，返回新数组的长度。
	元素的顺序可以改变，并且对新的数组不会有影响。
	 * */
	
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
    	int result = 0;
    	int temp [] = new int[A.length];
    	int index=0;
    	for(int i=0;i<A.length;i++){
    		if(A[i]!=elem){
    			temp[index++]=A[i];
    			result++;
    		}
    	}
    	for(int i=0;i<result;i++){
    		A[i]=temp[i];
    	}
//    	A=Arrays.copyOf(temp, result);    	
    	return result;
    }
    public static void main(String []args){
    	int [] A = {1,0,1,1,1,1,1,0,3,0};
    	int elem = 0;
    	int result = (new Solution_9()).removeElement(A, elem);
    	System.out.println(result);
    	for(int i=0;i<A.length;i++){
    		System.out.print("  "+A[i]);
    	}
    }
}
