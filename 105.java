/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution{
	public TreeNode buildTree (int[] preorder, int[] inorder){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		// put all node in map
		for(int i = 0; i<inorder.length; i++){
			map.put(inorder[i], i);
		}
		TreeNode root = buildMyTree (preorder, 0, preorder.length-1, inorder,0,inorder.length-1,map);
		return root;
	}
	public TreeNode buildMyTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> map){
		if(preStart > preEnd || inStart > inEnd){
			return null;
		}
		TreeNode root = new TreeNode(preorder[preStart]); // inorder start node is the root node

		int inRoot = map.get(root.val);
		int numsLeft = inRoot - inStart;

		root.left = buildMyTree(preorder, preStart +1, preStart+numsLeft, inorder, inStart, inRoot -1,map);
		root.right = buildMyTree(preorder, preStart + numsLeft +1, preEnd, inorder, inRoot +1, inEnd, map);

		return root;
	}
}

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/discuss/34541/5ms-Java-Clean-Solution-with-Caching