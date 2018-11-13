/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        ListNode moving = head;
        while(moving != null && moving.next != null){
            if(moving.val != 9)
            	temp = moving;
            moving = moving.next;
        }
        if(moving.val != 9) {
        	moving.val++;
        	return head;
        }
        temp.val++;
        temp = temp.next;
        while(temp != null){
        	temp.val = 0;
        	temp = temp.next;
        }
        return head.val == 0 ? dummy : dummy.next;
    }
}