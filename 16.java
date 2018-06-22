public class Solution{
	public int threeSumClosest(int[] nums, int target){
		Arrays.sort(nums);
		int l = nums.length;
		int result=0;

		if(l<3){
			for(int num:nums)
				result+=num;
			return result;
		}
		result = nums[0]+nums[1]+nums[2];
		if(l==3){
			return result;
		}
		for(int i=0; i< l-2;i++){
			int left = i+1;
			int right = l-1;
			while(left<right){
				int sum = nums[i]+nums[left]+nums[right];
				if(Math.abs(target-result)>Math.abs(target-sum)){
					result = sum;
				}
				if(target == sum)
					return result;
				else if(sum < target)
					left++;
				else
					right--;
			}
		}
		return result;

	}
}