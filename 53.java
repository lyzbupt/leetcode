class Solution{
	public int maxSubArray(int[] nums){
		int FinalMax = nums[0];
		int Point = nums[0];
		for(int i=1; i< nums.length;i++){
			Point = Math.max(nums[i],nums[i]+Point);
			FinalMax = Math.max(Point,FinalMax);
		}
		return FinalMax;
	}
}