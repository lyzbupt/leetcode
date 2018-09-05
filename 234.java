class Solution{
	public boolean isPalindrome(ListNode head){
		ListNode fast = head, slow = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast!=null){
			slow = slow.next;
		}
		slow = reverse(slow); // 把 slow 到 最后一个的取逆
		fast = head;  // 把fast设置到起始位置
		while(slow != null){
			if(fast.val != slow.val){
				return false;
			}
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}

	public ListNode reverse(ListNode node){
		ListNode prev = null;
		while( node != null){
			ListNode next = node.next;
			node.next = prev;
			prev = node;
			node = next;  
		}
		return prev;
	}
}