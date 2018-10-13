/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    	if(head == null)
    		return null;
        int num = 0; 
        ListNode temp = head, tear = head;
    	while(temp!=null){
    		num++;
    		temp = temp.next;
    	} 
        k = k % num;
        for(int i = 0; i<num-k-1;i++){
        	tear = tear.next;
        }
        ListNode res = new ListNode(0);
        res.next = tear.next;
        tear.next = null;
        ListNode temp2 = res;
        for(int i = 0; i<k;i++){
        	temp2 = temp2.next;
        }
        temp2.next = head;

        return res.next;
    }
}