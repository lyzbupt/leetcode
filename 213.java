class Solution {
    public int rob(int[] nums) {
        int res = 0;
        if(nums.length == 1) return nums[0];
        res = Math.max(rob(nums, 0, nums.length-1), rob(nums, 1, nums.length));
        return res;
    }
    private int rob(int[] nums, int low, int high){
    	int a = 0, b = 0;
    	for(int i = low; i < high; i++){
    		if(i % 2 == 0){
    			a = Math.max(a + nums[i], b);
    		}else{
    			b = Math.max(b + nums[i], a);
    		}
    	}
    	return Math.max(a, b);
    }
}