/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7

*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        ListNode temp1 = new ListNode(0);
        ListNode temp2 = new ListNode(0);
        temp1.next = l1;
        temp2.next = l2;

        temp1 = temp1.next;
        temp2 = temp2.next;

		while(temp1 != null){
			s1.push(temp1.val);
			temp1 = temp1.next;
		}

		while(temp2 != null){
			s2.push(temp2.val);
			temp2 = temp2.next;
		}

		int sum = 0;
		ListNode res = new ListNode(0);

		while(!s1.empty() || !s2.empty()){
			if(!s1.empty()) sum+=s1.pop();
			if(!s2.empty()) sum+=s2.pop();
			res.val = sum%10;
			ListNode head = new ListNode(sum/10);
			head.next  = res;
			res = head;
			sum/=10;
		}
        return res.val == 0? res.next : res;

    }
}