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
        if(head == null) return null;
        ListNode FakeHead = new ListNode(0);
        FakeHead.next = head;

        // used for delete node
        ListNode pre = FakeHead;
        ListNode cur = head;
        while(cur != null){
        	while(cur.next != null && cur.val == cur.next.val){
        		cur = cur.next;
        	}
        	if(pre.next == cur) // judge pre.next is the head or not, if deleted or not{}
        	{
        		pre = pre.next;  // return next, jump current node
        	}else{
        		pre.next = cur.next; // keep current node
        	}
        	cur = cur.next;
        }
        return FakeHead.next;
    }
}