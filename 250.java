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
	int res = 0;
    public int countUnivalSubtrees(TreeNode root) {
        dfs(root);
        return res;
    }
    private boolean dfs(TreeNode root){
    	if(root == null) return true;
    	boolean flag = true;
    	if(root.left != null) flag = flag && (root.left.val == root.val);
    	if(root.right != null) flag = flag && (root.right.val == root.val);
    	boolean a = dfs(root.left);
    	boolean b = dfs(root.right);
    	flag = flag && a && b;
    	if(flag) res++;
    	return  flag;
    }
}