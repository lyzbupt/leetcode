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
	int total;
    public int sumNumbers(TreeNode root) {
        total = 0;
        dfs(root, 0);
        return total;
    }
    void dfs(TreeNode root, int sum){
    	if(root == null) return;
    	sum = sum * 10 + root.val;
    	if(root.left == null && root.right == null){
    		total += sum; // this number finish, add it to totalSum
    		return;
    	}
    	dfs(root.left, sum);
    	dfs(root.right, sum);
    }
}