/*
class ListNode{
	int val;
	ListNode next;
	ListNode (int x){
	val = x;
	next = null;
	}
}
*/

public class Solution{
	public ListNode detectCycle(ListNode head){
		if(head == null){
			return null;
		}

		ListNode intersect = hasCycle(head);
		if(intersect == null){
			return intersect;
		}
		ListNode ptr1 = head;
		ListNode ptr2 = intersect;
		while(ptr1 != ptr2){
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		return ptr1;
	}


	public ListNode hasCycle(ListNode head){
		ListNode walker = head;
		ListNode runner = head;
		while(runner!=null && runner.next!=null){
			walker = walker.next;
			runner = runner.next.next;
			if(walker == runner){
				return walker;
			}
		}
		return null;
	}
}