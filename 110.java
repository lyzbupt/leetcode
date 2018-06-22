public class Solution{
	public boolean isBalanced(TreeNode root){
		if( root==null){
			return true;
		}

		int level1 = checkLevel(root.left);
		int level2 = checkLevel(root.right);
		return Math.abs(level1-level2)<=1 && isBalanced(root.left)&& isBalanced(root.right);
	}

	private int checkLevel(TreeNode root){
		if( root == null)
			return 0;

		int level1 = checkLevel(root.left);
		int level2 = checkLevel(root.right);
		return Math.max(level1, level2)+1;

	}
}