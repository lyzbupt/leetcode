/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


//1->1->1->4->4->4->2->2->4->2->2->4->2

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallerHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);
        ListNode smallerLast = smallerHead;
        ListNode greaterLast = greaterHead;

        while(head!=null){
        	if(head.val < x){
        		smallerLast.next = head;
        		smallerLast = head;
        	}
        	else{
        		greaterLast.next = head;
        		greaterLast = head;
        	}
        	head = head.next;
        }
        greaterLast.next = null;
        smallerLast.next = greaterHead.next;
        return smallerHead.next;
    }
}