package leetcode;

import java.util.ArrayList;

/**
 *  ͳ�Ʊȸ�������С�����ĸ���
    ����
    �ʼ�
    ����
    ����
����һ���������� 
���±��� 0 �� n-1������ n ��ʾ����Ĺ�ģ����ֵ��Χ�� 0 �� 10000����
�Լ�һ�� ��ѯ�б�����ÿһ����ѯ���������һ��������
���㷵�ظ�������С�ڸ���������Ԫ�ص�������
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
			//Ϊ���㷨��Ч�ʵ���ߣ���ò�Ҫ��ѭ���з����ض�������Լ������ص��������ĳ������
			// ��һ��ֱ��д�� i<A.length  ��    j<queries.length  �����ʱ
			
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
