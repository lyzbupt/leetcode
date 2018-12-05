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
    boolean flag = false;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null) return null;
        TreeNode leftNode = inorderSuccessor(root.left, p);
        if(flag) {
            flag = false;
            return root;
        }
        if(root == p) flag = true;
        TreeNode rightNode = inorderSuccessor(root.right, p);
        return leftNode == null ? rightNode : leftNode;
    }
}