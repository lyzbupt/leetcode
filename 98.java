/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution{
	public boolean isValidBST(TreeNode root){
		if(root == null) return true;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode pre = null;
		while(root!= null || !stack.isEmpty()){
			while(root!=null){
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if(pre != null && root.val <= pre.val) return false;
			pre = root;
			root = root.right;
		}
		return true;
	}
}
// https://leetcode.com/problems/validate-binary-search-tree/discuss/32112/Learn-one-iterative-inorder-traversal-apply-it-to-multiple-tree-questions-(Java-Solution)/187641

/*
class Solution {
    public boolean isValidBST(TreeNode root) {
    	if(root == null)
    		return true;
    	if(root.left != null && root.left.val >= root.val)
    		return false;
    	if(root.right != null && root.right.val <= root.val)
    		return false;
    	return isValidBST(root.left)&&isValidBST(root.right);
       
    }
}
*/