package leetcode;

import leetcode.ListNode;

public class Solution_2 {

	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		
		if(l1==null&&l2==null){
			return null;
		}
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		ListNode newhead = new ListNode(-1);
		ListNode result = newhead;
		int sum=0;		
		while(l1!=null||l2!=null){
			if(l1!=null){
				sum+=l1.val;l1=l1.next;
			}
			if(l2!=null){
				sum+=l2.val;l2=l2.next;
			}
			result.next = new ListNode(sum%10);
			sum=sum/10;
			result=result.next;
		}
		if(sum==1){
			result.next = new ListNode(1);
		}
		return newhead.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next=b;
		b.next =c;
		c.next =d;
		ListNode.showAllElement(a);
		
		ListNode e = new ListNode(3);
		ListNode f = new ListNode(1);
		ListNode g = new ListNode(7);
		ListNode h = new ListNode(2);
		e.next=f;
		f.next =g;
		g.next =h;
		
		
		
		ListNode.showAllElement(e);
		ListNode result = (new Solution_2()).addTwoNumbers(new ListNode(5), new ListNode(5));
		ListNode.showAllElement(result);
	}

}
