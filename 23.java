/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.length, (a,b) -> a.val-b.val);
        ListNode dummy = new ListNode(0);
        ListNode moving = dummy;

      	for(ListNode node : lists){  // add the k leading node to queue
      		if(node != null) queue.add(node);
      	} 
      	while(!queue.isEmpty()){
      		moving.next = queue.poll();
      		moving = moving.next;
      		if(moving.next != null) queue.add(moving.next);
      	}
      	return dummy.next;
    }
}