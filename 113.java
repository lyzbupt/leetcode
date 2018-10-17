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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        dfs(root, sum, new LinkedList<Integer>(), res);
        return res;
    }
    private void dfs(TreeNode root, int sum, List<Integer> currentResult,List<List<Integer>> res){
    	if(root == null) return;
    	currentResult.add(new Integer(root.val));
    	if(root.left == null && root.right == null && sum == root.val){
    		res.add(new LinkedList(currentResult));
    		currentResult.remove(currentResult.size()-1);
    		return;
    	}else{
    		dfs(root.left, sum - root.val, currentResult, res);
    		dfs(root.right, sum - root.val, currentResult,res);
    	}
    	currentResult.remove(currentResult.size()-1);
    }
}