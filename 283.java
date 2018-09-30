
// j always stay at 0 position
class Solution{
	public void moveZeroes(int[] nums){
		int j = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != 0){
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
	}
}


//   O(n^2)

class Solution {
    public void moveZeroes(int[] nums) {
        for(int i =0; i<nums.length; i++){
        	int temp = i;
        	if(nums[i] == 0){
        		while(temp<nums.length && nums[temp] == 0){
        			temp++;
        		}
        		if(temp<nums.length){
        			int t = nums[temp];
        			nums[temp] = nums[i];
        			nums[i] = t;
        		}
        	}
        }
    }
}