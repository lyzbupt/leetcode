class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<Integer>();

        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++){
            if(set.contains(nums2[j])){
                intersect.add(nums2[j]);
            }
        }
        int res[] = new int[intersect.size()];
        int i=0;
        for(Integer num : intersect){
            res[i++] = num;
        }
        return res;
    }
}

// https://leetcode.com/problems/intersection-of-two-arrays/discuss/81969/Three-Java-Solutions