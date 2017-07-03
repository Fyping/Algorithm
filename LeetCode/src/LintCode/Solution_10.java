package LintCode;

import java.util.LinkedList;

public class Solution_10 {

	/**������
	 * 
	 * 
	 * ��n�����򣬱��Ϊ0��n-1��ÿ��������һ������������nums�����С�
	 * ÿ�δ�����i���Եõ��ķ���Ϊ nums[left] * nums[i] * nums[right]��
	 * left��right�ֱ��ʾi�������ڵ��������򡣵�i���򱻴�����������������Ϊ���ڡ�
	 * Ҫ�󴵱��������򣬵õ����ķ�����
	 * 
	 * ����

	���� [4, 1, 5, 10]
	���� 270

	nums = [4, 1, 5, 10] burst 1, �÷� 4 * 1 * 5 = 20
	nums = [4, 5, 10]    burst 5, �÷� 4 * 5 * 10 = 200 
	nums = [4, 10]       burst 4, �÷� 1 * 4 * 10 = 40
	nums = [10]          burst 10, �÷� 1 * 10 * 1 = 10
	 * 
	 * */
	
    /**
     * @param nums a list of integer
     * @return an integer, maximum coins
     */
	private void dealWithAList(LinkedList<Integer> linkedNums){
		int temp;
        for(int i=0;i<linkedNums.size();i++){
        	temp=1;
        	if(i==0){
        		temp = linkedNums.get(0)*linkedNums.get(1);
 /*       		if(temp>maxTemp){
        			maxTemp=temp;
        			burstPos=0;
        			continue;
        		}
 */
        	}
        	if(i==linkedNums.size()-1){
        		temp = linkedNums.get(i)*linkedNums.get(i-1);
/*        		if(temp>maxTemp){
        			maxTemp=temp;
        			burstPos=i;
        		}
        		continue;
*/        	}
        	temp = linkedNums.get(i-1)*linkedNums.get(i)*linkedNums.get(i+1);
/*        	if(temp>maxTemp){
    			maxTemp=temp;
    			burstPos=i;
    		}
        	
*/        	
        }
//        linkedNums.remove(burstPos);
	}
	public int maxCoins(int []nums  ){
		 // Write your code here  
        int len = nums.length;  
        int[][] dp = new int[len+2][len+2];  
        int[][] visit = new int[len+2][len+2];  
        int[] numsPlus = new int[len+2];  
          
        for(int i = 1;i<len + 1;i++){  
            numsPlus[i] = nums[i - 1];  
        }  
        numsPlus[0] = 1;  
        numsPlus[len+1] = 1;  
          
        int result = search(dp , visit , numsPlus , 1 , len);  
          
        return result;  
	}
	
	 public int search(int[][] dp , int[][] visit , int[] numsPlus , int start , int end){  
	        if(visit[start][end] == 1){  
	            return dp[start][end];  
	        }  
	        int res = 0;  
	        for(int i = start ; i<=end ; i++){  
	            int mid = numsPlus[start-1]*numsPlus[i]*numsPlus[end+1];  
	            int right = search(dp , visit , numsPlus , start , i - 1);  
	            int left = search(dp , visit , numsPlus , i + 1 , end);  
	            res = Math.max(res , mid + right + left);  
	        }  
	        visit[start][end] = 1;  
	        dp[start][end] = res;  
	          
	        return res;  
	    }  
	
    public int maxCoins_s(int[] nums) {
        int max=0;
        int maxTemp=0;
        int burstPos = 0;
        int result = 0;
        LinkedList<Integer> linkedNums = new LinkedList<Integer>();
        for(int i=0;i<nums.length;i++){
        	linkedNums.add(nums[i]);
        }
      /*  for(int j=0;j<linkedNums.size();j++){
        	//if(j==1)linkedNums.remove(j);
        	
        	int temp=1;
	        for(int i=0;i<linkedNums.size();i++){
	        	temp=1;
	        	if(i==0){
	        		temp = linkedNums.get(0)*linkedNums.get(1);
	        		if(temp>maxTemp){
	        			maxTemp=temp;
	        			burstPos=0;
	        			continue;
	        		}
	        	}
	        	if(i==linkedNums.size()-1){
	        		temp = linkedNums.get(i)*linkedNums.get(i-1);
	        		if(temp>maxTemp){
	        			maxTemp=temp;
	        			burstPos=i;
	        		}
	        		continue;
	        	}
	        	temp = linkedNums.get(i-1)*linkedNums.get(i)*linkedNums.get(i+1);
	        	if(temp>maxTemp){
	    			maxTemp=temp;
	    			burstPos=i;
	    		}
	        	
	        	
	        }
	        linkedNums.remove(burstPos);
	        result+=maxTemp;
	        System.out.println("add :"+maxTemp);
	        maxTemp=0;
        	}
        for(int i=0;i<linkedNums.size();i++){
        	System.out.print("  "+linkedNums.get(i) );
        }*/
        return result;
    }
	
	public static void main(String [] args){
		int nums[] = {4, 1, 5, 10};
		System.out.println("   \n\n"+(new Solution_10().maxCoins(nums)));
	}
	
}
