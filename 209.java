class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(left < nums.length || right < nums.length){        
        	if(left < nums.length && sum >= s){
        		if(right - left<= res){
        			res = right - left;
        		}
        		sum = sum - nums[left++];                
        	}
        	else if(right < nums.length){
        		sum = sum + nums[right++];
        	}
        	else
        		break;
        }
        return res == Integer.MAX_VALUE?0:res;
    }
}