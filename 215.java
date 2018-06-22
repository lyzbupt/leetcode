
class Solution{
	
	public int findKthLargest (int[] nums, int k){

		int left = 0;
		int right = nums.length-1;
		int index = nums.length - k;
		int key;
		while(left<right){
			key = partion (nums, left, right);
			if(key == index )
				break;
			else if(key>index){
				right = key-1;
			}
			else{
                left = key+1;
			}
		}

		return nums[index];
	}	

	private int partion(int[] nums, int left, int right){
		int key = left;
		int temp;
		while(left<=right){
			while( left<=right && nums[left]<=nums[key])
				left++;
			while(left<=right && nums[right]>nums[key])
				right--;
			if(left<=right){
				temp = nums[left];
				nums[left]=nums[right];
				nums[right] =temp;
			}
			
		}
		temp = nums[key];
		nums[key]=nums[right];
		nums[right]=temp;
		return right;
	}


}

















private void quickSort(int[] a, int left, int right){
	if(left>right)
		return;
	int i = left;
	int j = right;
	int temp;
	int key = a[left];
	while(i<=j){
		while(i<=j && a[j]>key){
			j--;
		}
		while(i<=j && a[i]=<key){
			i++
		}
		if(i<=j){
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

	}
	temp = a[i];
	a[i] = a[left];
	a[left] = temp;

	quickSort(a, left, i-1);
	quickSort(a, i+1, right);
}



