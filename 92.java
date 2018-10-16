/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode pre = dummy;
    	ListNode curr = null;
    	ListNode second = null;
    	for(int i=1;i<m; i++){
    		pre = pre.next;
    	}
    	curr = pre.next;
    	second = curr.next;
    	for(int i = 0; i < n - m; i++){
    		curr.next = second.next;  // second.next may be null
    		second.next = pre.next;
    		pre.next = second;
    		second = curr.next;
    	}
    	return dummy.next;
    	
    }
}