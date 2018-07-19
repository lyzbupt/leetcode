/*
Given an array of integers and an integer k, 
find out whether there are two distinct indices i and j 
in the array such that nums[i] = nums[j] 
and the absolute difference between i and j is at most k.

at most k
at most k
at most k
*/


class Solution{
	public boolean containsNearbyDuplicate(int[] nums, int k){
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i<nums.length; i++){
			if(i>k)
				set.remove(nums[i-k-1]);
			if(!set.add(nums[i]))
				return true;
		}
		return false;
	}
}



/*

这个是恰好k的距离
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0 || nums == null || nums.length < k-1){
        	return false;
        }
        for(int i=0; i<nums.length-k;i++){
        	if(nums[i] == nums[i+k])
        		return true;
        }
        return false;
    }
}
*/