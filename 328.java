/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode evenHead = head.next;
        ListNode even = head.next;
        while(even != null && even.next != null){
        	ListNode temp = even.next;
        	even.next = temp.next;
        	odd.next = temp;

        	odd = odd.next;
        	even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}