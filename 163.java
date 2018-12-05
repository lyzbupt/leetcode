class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        if(nums == null || nums.length == 0){
        	res.add(generateRange(lower, upper));
        	return res;
        }
        int anchor = lower;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] < anchor) continue;
        	else if(nums[i] == anchor) anchor++;
        	else if(nums[i] <= upper){
        		res.add(generateRange(anchor, nums[i] - 1));
        		anchor = nums[i] + 1;
        		if(anchor == Integer.MIN_VALUE) return res;
        	}else{
        		break;
        	}
        }
        if(anchor <= upper && anchor != Integer.MIN_VALUE && anchor != Integer.MAX_VALUE) res.add(generateRange(anchor, upper));
        return res;
    }

    private String generateRange(int start, int end){
    	if(start == end) return ""+start;
    	else return start+"->"+end;
    }
}