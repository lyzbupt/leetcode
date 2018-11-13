/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k==1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode begin = dummy;
        ListNode end = dummy.next;
        int num = 0;
        while(end!=null){
        	num++;
        	if(num % k != 0){
        		end = end.next;
        	}else{
        		begin = reverse(begin, end.next);
        		end = begin.next;
        	}	
        }
        return dummy.next;
    }
	private ListNode reverse(ListNode begin, ListNode end){
		
		ListNode curr = begin.next;
		ListNode pre = null;
		ListNode first = curr;
		while(curr != end){
			ListNode next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		begin.next = pre;
		first.next = end;
	return first;
	}
}