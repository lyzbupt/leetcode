class Solution{
	public void flatten(TreeNode root){
		root = helper(root, null);
	}
	private TreeNode helper(TreeNode root, TreeNode prev){
		if(root == null){
			return prev;
		}
		prev = helper(root.right, prev);
		prev = helper(root.left, prev);
		root.right = prev;
		root.left = null;
		prev = root;
		return root;
	}
}
// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/discuss/36977/My-short-post-order-traversal-Java-solution-for-share/187853?page=3