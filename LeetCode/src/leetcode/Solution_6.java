package leetcode;
/**
 * 

�߶�����һ�ö�����������ÿ���ڵ�������������������start��end���ڱ�ʾ�ýڵ�����������䡣start��end�������������������µķ�ʽ��ֵ:

    ���ڵ�� start �� end �� build ������������
    ���ڽڵ� A ������ӣ��� start=A.left, end=(A.left + A.right) / 2��
    ���ڽڵ� A ���Ҷ��ӣ��� start=(A.left + A.right) / 2 + 1, end=A.right��
    ��� start ���� end, ��ô�ýڵ���Ҷ�ӽڵ㣬���������Ҷ��ӡ�

ʵ��һ�� build ���������� start �� end ��Ϊ����, Ȼ����һ���������� [start, end] ���߶�������������߶����ĸ���

 * **/

/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end) {
 *         this.start = start, this.end = end;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution_6 {
    /**
     *@param start, end: Denote an segment / interval
     *@return: The root of Segment Tree
     */
    public SegmentTreeNode build(int start, int end) {
        // write your code here
    }

}
