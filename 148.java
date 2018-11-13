/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// merge sort
// 1, 2, 3, 4
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;
        while(fast != null && fast.next != null){
        	pre = slow;
        	slow = slow.next;
        	fast = fast.next.next;
        }
        pre.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2){
    	ListNode dummy = new ListNode(0);
    	ListNode moving = dummy;
    	while(l1 != null && l2 != null){
    		if(l1.val < l2.val){
    			moving.next = l1;
    			l1 = l1.next;
    		}else{
    			moving.next = l2;
    			l2 = l2.next;
    		}
    		moving = moving.next;
    	}
    	if(l1 != null) moving.next = l1;
    	if(l2 != null) moving.next = l2;

    	return dummy.next;
    }
}