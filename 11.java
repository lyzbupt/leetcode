class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int j = height.length-1;
        int min=0;
        int result;
        int area=0;
        while(i<j){
            min = Math.min(height[i],height[j]);
            area = Math.max(area, (j-i)*min);
            if(height[i]>=height[j])
                j--;
            else
                i++;
        }
        return area;
    }
}