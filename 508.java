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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap();  // 每一种和的subtree有多少个
        helper(root, map);  // calculate all subtrees' sum
        List<Integer> list = new ArrayList();
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        	int fre = entry.getValue();
        	if(fre >= max){
        		if(fre > max){
        			list.clear();
        			max = fre;
        		}
        		list.add(entry.getKey());
        	}
        }
        // transmit List to int[]
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
        	res[i] = list.get(i);
        }
        return res;
    }
    private int helper(TreeNode root, HashMap<Integer, Integer> map){
    	if(root == null) return 0;
    	int left = helper(root.left, map);
    	int right = helper(root.right, map);
    	int sum = left + right + root.val;
    	map.put(sum, map.getOrDefault(sum, 0) + 1);
    	return sum;
    }
}