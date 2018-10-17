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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;
        while(curr!=null || !stack.empty()){
        	while(curr!=null){
        		stack.add(curr);
        		curr = curr.left;
        	}
        	curr = stack.pop();
        	res.add(curr.val);
        	curr = curr.right;
        }
        return res;
    }
}