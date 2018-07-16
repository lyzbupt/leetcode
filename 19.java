ListNode removeNthFromEnd(ListNode head, int n){
	ListNode start = new ListNode(0); // in case of remove the first one
	start.next = head;
	ListNode slow = start;
	ListNode fast = start;
	for(int i=0;i<=n;i++){
		fast=fast.next;
	}
	while(fast!=null){
		slow = slow.next;
		fast = fast.next;
	}
	slow.next = slow.next.next;
	return start.next;
}