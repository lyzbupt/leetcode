class Solution {
    public int[] singleNumber(int[] nums) {
        // pass1
    	int diff = 0;
        for (int num : nums){
        	diff = diff ^ num;
        }

        diff = diff & (~(diff-1)); // find last set bit, the last '1'

        // pass 2
        int[]  res = {0,0};

        // 把这两个数分流，有 diff 这个 ‘1’ 的数在下面，没有的在上面
        for(int num:nums){
        	if((num & diff) == 0)  // 没有 diff 这个 ‘1’
        	{
        		res[0] ^= num;
        	}
        	else{
        		res[1] ^= num;
        	}
        }
        return res;

    }
}


// https://leetcode.com/problems/single-number-iii/discuss/68900/Accepted-C++Java-O(n)-time-O(1)-space-Easy-Solution-with-Detail-Explanations