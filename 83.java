/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        while(head!= null && head.next!= null){
        	if(head.val == head.next.val){
        		head.next = head.next.next;
        	}
            else{
                head = head.next;
            }
        }
        return ans.next;
    }
}