/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
       ListNode dummy = new ListNode(0);
       ListNode curr = head;
       while(curr != null){
       		ListNode pre = dummy;
       		ListNode moving = dummy.next;
       		ListNode temp = curr.next;
       		while(moving != null && moving.val < curr.val){
       			pre = moving;
       			moving = moving.next;
       		}
       		curr.next = moving;
       		pre.next = curr;
       		curr = temp;
       }
       return dummy.next;
    }
}