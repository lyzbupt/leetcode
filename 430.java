/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
    public Node flatten(Node head){
        dfs(head);
        return head;
    }
    public Node dfs(Node head) {
        if(head == null) return head;
        Node curr = head;
        Node pre = head;
        while( curr != null){
            if(curr.child == null){
                pre = curr;
                curr = curr.next;
            }else{
                Node temp = curr.next;
                Node childTail = dfs(curr.child);
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
                childTail.next = temp;
                if(temp != null) temp.prev = childTail;
                curr = temp;
                pre = childTail;
            }
        }
        return pre;
    }
}