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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
        	int maxValue = Integer.MIN_VALUE;
        	int size = queue.size();
        	for(int i = 0 ; i < size; i++){
        		TreeNode node = queue.poll();
        		maxValue = Math.max(maxValue, node.val);
        		if(node.left != null) queue.add(node.left);
        		if(node.right != null) queue.add(node.right);
        	}
        	res.add(maxValue);
        }
        return res;
    }
}