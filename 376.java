class Solution {
    public int wiggleMaxLength(int[] nums) {
    	if(nums.length < 2) return nums.length;
        int pre = nums[0];
        int k = 1;
        while(k < nums.length && nums[k] == nums[k-1]) k++;
        if(k == nums.length ) return 1;
        boolean flag = !(nums[k] > nums[k-1]);
        int res = 1;
        for(int i = k; i < nums.length; i++){
            if(nums[i] == pre) continue;
        	if(nums[i] > pre != flag){
        		res++;
        		flag = !flag;
        	} 
        	pre = nums[i];
        }
        return res;
    }
}