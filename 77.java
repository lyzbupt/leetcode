class Solution {
    public List<List<Integer>> combine(int n, int k) {
       List<List<Integer>> res = new ArrayList<List<Integer>>();
       helper(res, new ArrayList<Integer>(), 1, n, k);
        return res;
    }
    void helper(List<List<Integer>> res, List<Integer> list, int i, int n , int k){
        if(k==0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int j = i; j <= n; j++){
            list.add(j);
            helper(res, list, j+1, n, k-1);
            list.remove(list.size()-1);
        }
    }
    
}