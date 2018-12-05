class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        if(nums == null || nums.length == 0) return res;
        int begin = nums[0];
        int pre = nums[0];
        for(int i = 1; i < nums.length; i++){
        	if(nums[i] - 1 == pre){
        		pre = nums[i];
        	}
        	else{
        		res.add(formRange(begin, pre));
        		begin = nums[i];
        		pre = nums[i];
        	}
        }
        res.add(formRange(begin, pre));
        return res;
    }
    private String formRange(int a, int b){
    	if(a == b) return a + "";
    	return a + "->" + b;
    }
}