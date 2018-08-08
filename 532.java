class Solution{
	// i index just go ahead
	// if there is a innterval makes it true
	// it will drop the tail, but the tear only occur once
	// drop means subscribing the remainder of the tail

	public boolean checkSubarraySum(int[] nums, int k){
		if(nums == null || nums.length == 0)
			return false;
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0,-1);
		for( int i = 0; i<nums.length; i++){
			sum+=nums[i];
			if(k!=0)
				sum = sum % k;
			if(map.containsKey(sum)){
				if(i - map.get(sum) > 1)
					return true;
			}
			else{
				map.put(sum,i);
			}
		}
		return false;
	}
}