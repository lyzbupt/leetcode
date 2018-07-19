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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> tree = new ArrayList<List<Integer>>();
        if(root == null){
        	return tree;
        }
        recrusion(tree, root, 0);
        return tree;
    }

    public void recrusion(List<List<Integer>> tree, TreeNode root, int level){
    	if(root == null) return;
    	if(level >= tree.size()){
    		tree.add(new ArrayList<Integer>());
    	}
    	tree.get(level).add(root.val);
    	recrusion(tree, root.left, level+1);
    	recrusion(tree, root.right, level+1);

    }
}