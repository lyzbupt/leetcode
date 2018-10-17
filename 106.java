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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0|| postorder ==null || postorder.length ==0){
        	return null;
        }
        return helper(inorder, 0, inorder.length-1, postorder, postorder.length-1);
    }
    private TreeNode helper(int[] in, int start, int end, int[] post, int index){
    	if(start > end || index <  0) return null;
    	TreeNode root = new TreeNode(post[index]);
    	int i;
    	for(i = start; i <= end; i++){
    		if(in[i] == root.val) break; // find the root point in inorder  
    	}
    	root.right = helper(in,i+1, end, post,index-1);
    	root.left = helper(in, start, i-1, post, index - (end-i+1));
    	return root;
	}
}