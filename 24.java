
/**
 *Given a linked list, swap every two adjacent nodes and return its head.
 *Given 1->2->3->4, you should return the list as 2->1->4->3.
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode start = new ListNode(0);   // 浅拷贝，只用来存初始指针，然后用来return
        start.next = head;
        ListNode current = start;     // 浅拷贝
        while(current.next!=null && current.next.next!=null){
        	ListNode first = current.next;
        	ListNode second = current.next.next;
        	current.next = second; // important, 把start的next变成了 second
        	first.next = second.next;
        	second.next = first;
      		current = first;  // 把current指针重新赋值，不会影响start
    

        }
        return start.next;

    }
}
