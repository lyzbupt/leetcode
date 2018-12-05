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
	class Result{
		int inc;
		int des;
		public Result(){
			inc = 1;
			des = 1;
		}
	}
	int max;
    public int longestConsecutive(TreeNode root) {
        max = 0;
        helper(root);
        return max;
    }

    private Result helper(TreeNode root){
    	if(root == null) return null;
        Result left = helper(root.left);
        Result right = helper(root.right);
        Result curr = new Result();

        if(root.left != null){
        	if(root.val - root.left.val == 1){
        		curr.inc = Math.max(curr.inc, left.inc + 1);
        	}
        	else if(root.val - root.left.val == -1){
        		curr.des = Math.max(curr.des, left.des + 1);
        	}
        }
        if(root.right != null){
        	if(root.val - root.right.val == 1){
        		curr.inc = Math.max(curr.inc, right.inc + 1);
        	}
        	else if(root.val - root.right.val == -1){
        		curr.des = Math.max(curr.des, right.des + 1);
        	}
        }
        max = Math.max(max, curr.inc + curr.des - 1);
        return curr;
    }
}