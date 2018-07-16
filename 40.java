// https://leetcode.com/problems/combination-sum/discuss/16502/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)
// a serial of same question

class Solution{
	public List<List<Integer>> combinationSum2(int[] nums, int target){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backTrack(list, new ArrayList<>(), nums, target, 0);
		return list;
	}

	private void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start){
		if(remain < 0){
			return;
		}
		else if(remain == 0){
			list.add(new ArrayList<>(tempList));
		}
		else{
			for(int i = start; i<nums.length;i++){
				if(i>start && nums[i] == nums[i-1]){
					continue;
				}
				tempList.add(nums[i]);
				backTrack(list, tempList, nums, remain - nums[i], i+1);
				tempList.remove(tempList.size()-1);
			}
		}
	}
}

	