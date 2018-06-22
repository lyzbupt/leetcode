public class Solution{
	public boolean isSymmetric(TreeNode root){
		if(root == null){
			return true;
		}
		return recursive(root.left, root.right);
	}

	private boolean recursive(TreeNode leftN, TreeNode rightN){
		if(leftN != null ^ rightN!=null)    // ^ 表示异或， 相同结果为1
			return false;
		else if(leftN == null && rightN==null)
			return true;
	
		return recursive(leftN.left, rightN.right)&&
				recursive(leftN.right, rightN.left)&&
				leftN.val == rightN.val;
	}

}