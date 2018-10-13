class Solution {
    public boolean canJump(int[] nums) {
    	if(nums==null || nums.length==0) return true;
        int lasPos = nums.length - 1;
        for(int i = nums.length - 1; i>=0;i--){
        	if(i+nums[i] >= lasPos){
        		lasPos = i;
        	}
        }
        return lasPos == 0;
    }
}