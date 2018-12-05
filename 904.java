class Solution {
    public int totalFruit(int[] tree) {
        if(tree == null || tree.length == 0) return 0;
        int res = 0;
        int count = 0;
        int countCurr = 0;
        int pre = tree[0];
        int curr = tree[0];  
        for(int i = 0; i < tree.length; i++){
            if(curr == tree[i]){
                countCurr++;
                count++;
            }else if(pre == tree[i]){
                count++;
                countCurr = 1;
                pre = curr;
                curr = tree[i];
            }else{
            	count = countCurr + 1;
            	countCurr = 1;
            	pre = curr;
                curr = tree[i];
                
            }
            res = Math.max(res, count);
        }
        return res;
    }
}