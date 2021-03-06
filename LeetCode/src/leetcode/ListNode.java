package leetcode;

public class ListNode {

	int val;
	ListNode next;
	ListNode(){}
	ListNode(int x) { val = x; }
	
	public void setVal(int val){
		this.val= val;
	}
	
	public static  void showAllElement(ListNode head){
		if(head==null){
			return ;
		}
		System.out.print("[");
		while(head.next!=null){
			System.out.print(head.val);
			System.out.print(",");
			head=head.next;
		}
		System.out.print(head.val);
		System.out.print("]");
	}
	public ListNode reverseList(ListNode head){
		if (head == null){
            return head;
        }
        ListNode nextNode = head.next;
        head.next = null;
        while (nextNode!=null){
            ListNode nextNextNode = nextNode.next;
            nextNode.next = head;
            head = nextNode;
            nextNode = nextNextNode;
        }
        return head;
	}
	public boolean isPalindrome(ListNode head) {
		Boolean result = true;
		if(head==null){
			return true;
		}
		ListNode pst=head;
		while(pst.next!=null){
			pst=pst.next;
		}
		ListNode re = pst.reverseList(pst);
		ListNode.showAllElement(head);
		ListNode.showAllElement(re);
		while(head.next!=null){
			if(head.val!=re.val){
				result=false;
				break;
			}
			head=head.next;
			re=re.next;
		}
		return result;
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
		
		//a.showAllElement(a);
		//a.reverseList(a);
		//d.showAllElement(d);
		System.out.println(a.isPalindrome(a));
	}

}
