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
    public int countNodes(TreeNode root) {
        int h = height(root); // O(log(n)), find max height
        int res = 0;    // store total number of node
        while(root != null){  // O(log(n) * log(n))
        	if(height(root.right) == h - 1){ // left is tree full of h
        		res += (1 << h); // 2^h - 1 + 1
        		root = root.right;
        	}
        	else{     // right is full tree of h - 1
        		res += (1 << h - 1);
        		root = root.left;
        	}
        	h--;
        }
        return res;
    }

    private int height(TreeNode root){
    	return root == null ? -1 : 1 + height(root.left);
    }
}