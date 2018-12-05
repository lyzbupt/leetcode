class NumArray{
	int[] nums;
	int[] sums;
	int n;
    public NumArray(int[] nums) {
        this.nums = nums;
        n = nums.length;
        sums = new int[n+1];
        for(int i  = 0; i < n; i++){
            int j = i + 1;
            while(j <= n){
                sums[j] += nums[i];
                j += lowbit(j);
            }
        }
    }
    
    public void update(int i, int val) {
        int diff = val - nums[i];
        nums[i] = val;
        i++;
        while( i <= n){
        	sums[i] += diff;
        	i += lowbit(i);
        }
    }
    
    public int sumRange(int i, int j) {
        return getSum(j) - getSum(i - 1);
    }

    public int getSum(int i){
    	int sum = 0;
    	i++;
    	while(i > 0){
    		sum += sums[i];
    		i -= lowbit(i);
    	}
    	return sum;
    }
    private static int lowbit(int i){
    	return i & (-i);
    }
}


/*
class NumArray {
    int[] dp;
    public NumArray(int[] nums) {
        dp = new int[nums.length + 1];
        for(int i = 1; i <= nums.length; i++){
            dp[i] = dp[i-1] + nums[i-1];
        }
    }
    
    public void update(int i, int val) {
        int oldNum = dp[i+1] - dp[i];
        int diff = val - oldNum;
        for(int j = i+1; j < dp.length; j++){
            dp[j] += diff;
        }
    }
    
    public int sumRange(int i, int j) {
        return dp[j + 1] - dp[i];
    }
}
*/
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */

