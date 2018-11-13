/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node pre = null;
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        Node dummy = new Node(0, null, null);
        pre = dummy;
        dfs(root);
        pre.right = dummy.right;
        dummy.right.left = pre;
        return dummy.right;
    }
    private void dfs(Node curr){
        if(curr == null) return;
        dfs(curr.left);
        pre.right = curr;
        curr.left = pre;
        pre = curr;
        dfs(curr.right);
    }
}