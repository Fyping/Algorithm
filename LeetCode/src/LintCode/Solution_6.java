package LintCode;

import java.util.Vector;

public class Solution_6 {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        // write your code here
    	if(num==-1){
    		// -1 = b(11111111111111111111111111111111)
    		return 32;
    	}
    	int count = 0;
    	if(num>0){
	    	while(num>0){
	    		int temp = num%2;
	    		if(temp==1){
	    			count++;
	    		}
	    		num=(num-temp)/2;
	    	}
    	}else{
    		if(num==0){
    			return 0;
    		}
    		num = -num;
    		while(num>0){
	    		int temp = num%2;
	    		if(temp==0){
	    			count++;
	    		}
	    		num=(num-temp)/2;
	    	}
    		count=32-count;
    	}
    	return count;
    }
    public static void main(String []args){
    	System.out.println(-19%2);
    	System.out.println((new Solution_6()).countOnes(-178));
    }
}