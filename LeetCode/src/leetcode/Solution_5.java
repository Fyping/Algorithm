package leetcode;

import java.util.ArrayList;

/**
 *  统计比给定整数小的数的个数
    描述
    笔记
    数据
    评测
给定一个整数数组 
（下标由 0 到 n-1，其中 n 表示数组的规模，数值范围由 0 到 10000），
以及一个 查询列表。对于每一个查询，将会给你一个整数，
请你返回该数组中小于给定整数的元素的数量。
 * */
public class Solution_5 {
	   /**
	     * @param A: An integer array
	     * @return: The number of element in the array that 
	     *          are smaller that the given integer
	     */
	    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
			ArrayList<Integer> result = new ArrayList<Integer>();
			
			int count=0;
			int lenq= queries.length;
			int lenA=A.length;
			//为了算法的效率的提高，最好不要在循环中反复地定义变量以及反复地调用数组的某个方法
			// 第一次直接写的 i<A.length  和    j<queries.length  结果超时
			
			for(int i=0;i<lenq;i++){
				count=0;
				for(int j=0;j<lenA;j++){
					if(A[j]<queries[i]){
						count++;
					}
				}
				result.add(count);
			}
	    	
	    	return result;

	    }
	}
