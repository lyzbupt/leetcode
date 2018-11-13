/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        if(head == null) return 0;
        ListNode curr = head;
        
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : G){
        	set.add(i);
        }
        while(curr != null){
        	if(set.contains(curr.val) && ((curr.next == null)
        		|| !set.contains(curr.next.val)))
        		res++;
        	curr = curr.next;
        }
        return res ;
    }
}