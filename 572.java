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
    public boolean isSubtree(TreeNode s, TreeNode t) {
    	if(s == null) return t == null;
    	boolean flag = isSame(s, t);
    	flag = flag || isSubtree(s.left,t);
    	flag = flag || isSubtree(s.right,t);
    	// return isSame(s, t) || isSubtree(s.left,t) || isSubtree(s.right,t);
        return flag;
    }
	
    private boolean isSame(TreeNode s, TreeNode t){
    	if(s==null || t ==null) return (s == null)&&(t==null);
    	return s.val == t.val && isSame(s.left, t.left) && isSame(s.right, t.right);
    }

}