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
    int res;
    class result{
        int count;
        boolean b;
        int maxV;
        int minV;
        result(){count = 0;
                b = true;
                }
    }
    public int largestBSTSubtree(TreeNode root) {
        helper(root);
        return res;
    }
    
    private result helper(TreeNode root){
        result r = new result();
        if(root == null) return r;
        boolean bl = true, br = true;
        result left = helper(root.left);
        result right = helper(root.right);
        if(root.left != null) {
            bl = root.val > root.left.val && (root.val > left.maxV);
            r.minV = left.minV;
        }else{
            r.minV = root.val;
        }
        if(root.right != null){
             br = root.val < root.right.val && (root.val < right.minV);
             r.maxV = right.maxV;
        }else{
            r.maxV = root.val;
        }
        if(bl && br && left.b && right.b){
            r.count = left.count + right.count + 1;
            res = Math.max(res, r.count);
            return r;
        }
        else{
            r.b = false;
            return r;
        }
    }
}
