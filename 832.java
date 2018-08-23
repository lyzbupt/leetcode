class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        for(int i = 0; i<m;i++){
        	reverse(A[i]);
        	invert(A[i]);
        }
        
        return A;
    }
    private void reverse(int[] a){
    	int start = 0;
    	int end = a.length -1;
    	while(start<end){
    		int temp = a[start];
    		a[start] = a[end];
    		a[end] = temp;
    		start++;
    		end --;
    	}
    }
    private void invert(int[] a){
    	for(int i=0; i<a.length; i++){
    		a[i] = a[i] == 1 ? 0 : 1;
    	}
    }
}