package leetcode;

import java.util.LinkedList;
import java.util.List;
// 注意：由于是对链表的尾部频繁地操作，因此适宜采用ArrayList或者Vector 而非LinkedList 
// 用LinkedList 反而超时
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
给定一个列表，该列表中的每个要素要么是个列表，要么是整数。将其变成一个只包含整数的简单列表。
注意事项

如果给定的列表中的要素本身也是一个列表，那么它也可以包含列表。
您在真实的面试中是否遇到过这个题？
样例

给定 [1,2,[1,2]]，返回 [1,2,1,2]。

给定 [4,[3,[2,[1]]]]，返回 [4,3,2,1]。
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
