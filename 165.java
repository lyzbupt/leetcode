class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        for(String s : v1){
        	nums1.add(Integer.parseInt(s));
        }
        for(String s : v2){
        	nums2.add(Integer.parseInt(s));
        }
        int l1 = nums1.size();
        int l2 = nums2.size();
        for(int i  = 0; i < Math.max(l1,l2); i++){
            int a = i < l1 ? nums1.get(i) : 0;
            int b = i < l2 ? nums2.get(i) : 0;
        	if(a > b) return 1;
        	else if(a < b) return -1;
        }
        return 0;
    }
}