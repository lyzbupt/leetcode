class Solution {
    public void nextPermutation(int[] nums) {
        int l = nums.length;
        int i =l-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = i+1;
            while(j<=l-1 && nums[j]>nums[i]){
                j++;
            }
            swap(nums,i,j-1);
        }
        reverse(nums,i+1);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start){
        int j = nums.length-1;
        int i = start;
        while(i<j){
            swap(nums, i , j);
            i++;
            j--;
        }
    }
}