class Solution{
	public List<List<Integer>> fourSum(int[] nums, int target){
		ArrayList<List<Integer>> result = new ArrayList<>();
		int l = nums.length;
		if(nums.length<4)
			return result;
		Arrays.sort(nums);
		if(nums[l-4]+nums[l-3]+nums[l-2]+nums[l-1]<target)
			return result;
		for(int i=0; i<l-3;i++){
			if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)
				break;
			if(nums[i]+nums[l-3]+nums[l-2]+nums[l-1]<target)
				continue;
			if(i>0&&nums[i]==nums[i-1])
				continue;
			for(int j=i+1;j<l-2;j++){
				if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target)
					break;
				if(nums[i]+nums[j]+nums[l-2]+nums[l-1]<target)
					continue;
				if(j>i+1 && nums[j]==nums[j-1])
					continue;
				int left = j+1;
				int right = l-1;
				while(left<right){
					int sum = nums[i]+nums[j]+nums[left]+nums[right];
					if(sum == target){
						result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
						while(left<right && nums[left]==nums[left+1]) left++;
						while(left<right && nums[right]==nums[right-1])right--;
						left++;
						right--;
					}
					else if(sum<target)
						left++;
					else
						right--;
				}
			}

		}
		return result;
	}
}