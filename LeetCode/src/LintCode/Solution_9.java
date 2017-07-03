package LintCode;

import java.util.Arrays;

public class Solution_9 {

	/**
	 * 
	 * ɾ��Ԫ��
	 * ����һ������ [0,4,4,0,0,2,4,4]����ֵ 4
	���� 4 ����4��Ԫ�ص�������Ϊ[0,0,0,2]
	����һ�������һ��ֵ����ԭ��ɾ����ֵ��ͬ�����֣�����������ĳ��ȡ�
	Ԫ�ص�˳����Ըı䣬���Ҷ��µ����鲻����Ӱ�졣
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
