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
    public int closestValue(TreeNode root, double target) {
        TreeNode kid = target < root.val ? root.left : root.right;
        if(kid != null){
        	int temp = closestValue(kid, target);
        	return Math.abs(root.val - target) < Math.abs(temp - target) ? root.val : temp;
        }
        return root.val;
    }
}