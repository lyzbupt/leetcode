public class Solution{
	public TreeNode sortedArrayToBST(int[] nums){
		return createNextNode(nums, 0, nums.length-1);
	}
	private TreeNode createNextNode(int[] nums, int Left,int Right){
		if(Left > Right)
			return null;
		int mid = (Left+Right)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = createNextNode( nums, Left, mid-1);
		root.right = createNextNode( nums, mid+1, Right);

		return root;
	}
}