/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode curr = root;
        int N = 0;
        while(curr != null){
        	N++;
        	curr = curr.next;
        }

        curr = root;
        int quot = N / k;
        int rem = N % k;
        ListNode[] ans = new ListNode[k];

        for(int i =0; i < k; i++){
        	ListNode head = curr;
        	for(int j = 0; j < quot + (rem > i ? 1 : 0) - 1; j++){
        		if(curr!=null) curr = curr.next;
        	}
        	if(curr != null){
        		ListNode pre = curr;
        		curr = curr.next;
        		pre.next = null;
        	}
        	ans[i] = head;
        }
        return ans;
    }
}