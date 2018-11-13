class Solution{
	public List<List<Integer>> subsetsWithDup(int[] nums){
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		helper(res, nums, new ArrayList<>(), 0);
		return res;
	}
	private void helper(List<List<Integer>> res, int[] nums, List<Integer> list, int n){
		res.add(new ArrayList<Integer>(list));
		for(int i = n; i < nums.length; i++){
			if( i > n && nums[i] == nums[i-1]) continue;
			list.add(nums[i]);
			helper(res, nums, list, i+1);
			list.remove(list.size()-1);
		}
	}
}