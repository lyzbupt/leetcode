class Solution {
    public int[] searchRange(int[] nums, int target) {
    	int[] result = { -1, -1};
    	if(nums == null || nums.length == 0){
    		return result;
    	}
    	int left = firstGreaterEqual(nums, target);
        if(left == nums.length || nums[left] != target){
        	return result;
        }
        return new int[]{left, firstGreaterEqual(nums, target+1)-1};
        
    }
	//find the first number that is greater than or equal to target.
	//could return A.length if target is greater than A[A.length-1].
    private int firstGreaterEqual(int[] nums, int target){
    	int low = 0, high = nums.length; // important == length rather length-1
    	while(low < high){
    		int mid = low + ((high-low) >> 1);
    		if(nums[mid]<target){
    			low = mid + 1;
    		}else{
    			high = mid;
    		}
    	}   
    	return low;
    }
}