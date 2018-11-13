/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val,Node _next) {
        val = _val;
        next = _next;
    }
};
*/
class Solution {
    public Node insert(Node head, int insertVal) {
        if(head == null){
        	Node node = new Node(insertVal, null);
        	node.next = node;
        	return node;
        }

        Node curr = head;
        while(curr.val <= curr.next.val && curr.next != head)
        	curr = curr.next;

    	Node maxNode = curr;
    	Node dummy = new Node(0, maxNode.next);
    	maxNode.next = null;
    	curr = dummy;
    	while(curr.next != null && curr.next.val < insertVal){
    		curr = curr.next;
    	}
    	curr.next = new Node(insertVal, curr.next);
    	Node newMax = maxNode.next == null ? maxNode : maxNode.next;
    	newMax.next = dummy.next;
        return head;
    }
}