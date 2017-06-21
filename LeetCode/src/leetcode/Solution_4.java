package leetcode;

import java.util.LinkedList;
import java.util.List;
// ע�⣺�����Ƕ������β��Ƶ���ز�����������˲���ArrayList����Vector ����LinkedList 
// ��LinkedList ������ʱ
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer,
 *     // rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds,
 *     // if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds,
 *     // if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */

/*
����һ���б����б��е�ÿ��Ҫ��Ҫô�Ǹ��б�Ҫô��������������һ��ֻ���������ļ��б�
ע������

����������б��е�Ҫ�ر���Ҳ��һ���б���ô��Ҳ���԰����б�
������ʵ���������Ƿ�����������⣿
����

���� [1,2,[1,2]]������ [1,2,1,2]��

���� [4,[3,[2,[1]]]]������ [4,3,2,1]��
*/

// @param nestedList a list of NestedInteger
// @return a list of integer



public class Solution_4 {/**
	 * // This is the interface that allows for creating nested lists.
	 * // You should not implement it, or speculate about its implementation
	 * public interface NestedInteger {
	 *
	 *     // @return true if this NestedInteger holds a single integer,
	 *     // rather than a nested list.
	 *     public boolean isInteger();
	 *
	 *     // @return the single integer that this NestedInteger holds,
	 *     // if it holds a single integer
	 *     // Return null if this NestedInteger holds a nested list
	 *     public Integer getInteger();
	 *
	 *     // @return the nested list that this NestedInteger holds,
	 *     // if it holds a nested list
	 *     // Return null if this NestedInteger holds a single integer
	 *     public List<NestedInteger> getList();
	 * }
	 */
	public class Solution {

	    // @param nestedList a list of NestedInteger
	    // @return a list of integer
	    public List<Integer> flatten(List<NestedInteger> nestedList) {
	        // Write your code here
	       flatten_1(nestedList);
	       return this.result;
	    }
	    private List<Integer> result = new ArrayList<Integer>();
	    public void flatten_1(List<NestedInteger> nestedList) {
			for(int i=0;i<nestedList.size();i++){
				if(nestedList.get(i).isInteger()){
					result.add(nestedList.get(i).getInteger());
				}else{
					flatten(nestedList.get(i).getList());
				}
			}
		}
	}}
