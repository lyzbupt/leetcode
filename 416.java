class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if((sum & 1) == 1) return false;
        sum = sum >> 1;
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        for(int i = 0; i <= nums.length; i++) dp[i][0] = true;
        for(int j = 0; j<= sum; j++){        
            for(int i = 1; i <= nums.length; i++){
                dp[i][j] = dp[i-1][j];
                if(j >= nums[i-1]){
                    dp[i][j] |= dp[i-1][j - nums[i-1]];
                }
            }
        }
        return dp[nums.length][sum];
    }
}