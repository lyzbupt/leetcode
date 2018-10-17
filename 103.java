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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }
    private void helper(TreeNode curr, List<List<Integer>> res, int level){
    	if(curr == null) return;
    	if(res.size() <= level){
    		List<Integer> newLevel = new LinkedList<>();
    		res.add(newLevel);
    	}
    	List<Integer> collection = res.get(level);
    	if(level % 2 == 0) collection.add(curr.val);
    	else collection.add(0, curr.val);
    	helper(curr.left, res, level+1);
    	helper(curr.right, res, level+1);
    }
}