class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int temp = 0;
        for(int n:nums){
        	if(n==1){
        		temp++;
        	}else{
        		res = Math.max(res, temp);
        		temp=0;
        	}
        }
        return Math.max(res,temp);
    }
}