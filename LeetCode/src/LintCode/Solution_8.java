package LintCode;

import java.util.Stack;

/**
 * 移动零
 * 
 * 给一个数组 nums 写一个函数将 0 移动到数组的最后面，非零元素保持原数组的顺序
 * */
public class Solution_8 {

    /**
     * @param nums an integer array
     * @return nothing, do this in-place
     */
	
    public void moveZeroes(int[] nums) {
    	int numLen = nums.length;
    	int [] temp = new int[numLen];
    	int index=0;
    	for(int i=0;i<numLen;i++){
    		if(nums[i]!=0){
    			temp[index++]=nums[i];
    		}
    	}
    	for(int i=index;i<numLen;i++){
    		temp[i]=0;
    	}
    	for(int i=0;i<numLen;i++){
    		nums[i]=temp[i];
    	}
    	for(int i=0;i<numLen;i++){
    		System.out.print(nums[i]+" ");
    	}
    	
    	//100% 数据通过测试.  总耗时: 13712 ms
       //10778ms 在修改为   int numLen = nums.length;之后，这说明不停的访问数组的长度比访问一个变量更耗时间
    }

    //Solution_2
    public void moveZeroes_1(int [] nums){
    	//-1,2,-3,4,0,1,0,-2,0,0,1
    	Stack<Integer> stack = new Stack<Integer>();
    	int numLen = nums.length;
    	for(int i=0;i<numLen;i++){
    		if(nums[i]!=0){
    			stack.add(nums[i]);
    		}
    	}
    	for(int i=numLen-1;i>=0;i--){
    		if(i>=stack.size()){
    			nums[i]=0;
    		}else{
    			nums[i]= stack.pop();
    		}
    	}
    	for(int i=0;i<nums.length;i++){
    		System.out.print(nums[i]+" ");
    	}
    	// 11892  ms  100% 数据通过测试. 
    }
    public static void main(String args[]){
    	//int [] nums = {0,1,2,5,3,4,6,8,7,9,20,1,1,3,0,2,0,1,0};
    	//int [] nums = {0,1,0,3,12};
    	int [] nums ={-1,2,-3,4,0,1,0,0,0,-2,0,0,0,0,1};
    	(new Solution_8()).moveZeroes_1(nums);
    }
}
