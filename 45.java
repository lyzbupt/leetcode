class Solution {  // greedy
    public int jump(int[] nums) {
        int jumps = 0;
        int curEnd = 0;
        int curFurthest = 0;
        for(int i = 0; i < nums.length - 1; i++){
        	curFurthest = Math.max(curFurthest, nums[i] + i);
        	if(i == curEnd){
        		jumps++;
        		curEnd = curFurthest; 
        	}
        }
        return jumps;
    }
}