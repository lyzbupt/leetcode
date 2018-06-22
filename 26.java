class Solution{
	public int removeDuplicates(int[] nums){
		if(nums == null || nums.length<=1)
			return nums.length;
		int point =0;
		for (int i=1; i<nums.length;i++){
			if(nums[point] != nums[i]){
				point++;
				nums[point]=nums[i];
			}
		}
		return point+1;
	}
}