class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> queque = new PriorityQueue<>((a,b) -> (a[0]+a[1]-b[0]-b[1]));
        List<int[]> res = new ArrayList<>();
        if(nums1.length == 0 || nums2.length == 0 || k == 0) return res;
        index2 = 0;
        for(int i = 0; i < nums1.length && i < k; i++){
        	queue.offer(new int[]{nums1[i], nums2[index2], index2});
        }
        while(k-- > 0 && !queue.isEmpty()){
        	int[] curr = queue.poll();
        	index2 = curr[2] + 1;
        	res.add(new int[]{curr[0], curr[1]});
        	if(index2 == nums2.length-1) continue;
        	// 在curr[0]的基础上，找到index2
        	queue.add(new int[]{curr[0], nums[index2], index2});
        }
        return res;
    }
}