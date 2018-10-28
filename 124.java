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
	int res;
    public int maxPathSum(TreeNode root) {
        res = Integer.MIN_VALUE;
        helper(root);
        return res;
    }
    private int helper(TreeNode root){
    	if(root == null)
    		return 0;
    	int left = helper(root.left);
    	int right = helper(root.right);

    	res = Math.max(left + right + root.val, res);
    	return Math.max(Math.max(left,right)+root.val,0);

    }
}