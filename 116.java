/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        TreeLinkNode mostLeft = root;
        TreeLinkNode cur = null;
        while(mostLeft.left!=null){
        	cur = mostLeft;
        	while(cur!=null){
        		cur.left.next = cur.right;
        		if(cur.next != null) cur.right.next = cur.next.left;
        		cur = cur.next;
        	}
        	mostLeft = mostLeft.left;
        }
    } 
}