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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        dfs(list, root);
        //System.out.println(list);
        return list.get(k-1);
    }

    public void dfs(List list, TreeNode root){
    	if(root == null) return;
    	if(root.left != null) dfs(list, root.left);
    	list.add(root.val);
    	if(root.right != null) dfs(list, root.right);
    } 
}


class Solution {
	int k;
    public int kthSmallest(TreeNode root, int k) {
    	this.k = k;
        ArrayList<Integer> list = new ArrayList<Integer>();
        dfs(list, root);
        //System.out.println(list);
        return list.get(k-1);
    }

    public void dfs(List list, TreeNode root){
    	if(root == null) return;
    	if(root.left != null) dfs(list, root.left);
    	list.add(root.val);
    	if(list.size() == k) return;
    	if(root.right != null) dfs(list, root.right);
    } 
}