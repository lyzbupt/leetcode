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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
        	return new LinkedList<TreeNode>();
        }
        return helper(1, n);
    }
    private LinkedList<TreeNode> helper(int start, int end){
    	LinkedList<TreeNode> list = new LinkedList<TreeNode>();
    	if(start > end){
    		list.add(null);
    		return list;
    	}

    	for(int i = start; i <= end; i++){
    		LinkedList<TreeNode> left_trees = helper(start, i-1);
    		LinkedList<TreeNode> right_trees = helper(i+1, end);

    		for(TreeNode l : left_trees){
    			for(TreeNode r : right_trees){
    				TreeNode curr_tree = new TreeNode(i);
    				curr_tree.left = l;
    				curr_tree.right = r;
    				list.add(curr_tree);
    			}
    		}
    	}
    	return list;
    }
}