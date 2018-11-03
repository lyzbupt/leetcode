/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	TreeNode a = null;
	TreeNode b = null;
	TreeNode prevElement = new TreeNode( Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        dfs(root);
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }
    private void dfs(TreeNode root){
    	if(root == null) return;
    	dfs(root.left);
    	if(a == null && prevElement.val >= root.val){
    		a = prevElement;
    	}
    	if(a != null && prevElement.val >= root.val){
    		b = root;
    	}
    	prevElement = root;
    	dfs(root.right);
    }
}