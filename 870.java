class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int n = A.length;
        int[] res = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for(int index = 0; index < n; index++) pq.add(new int[]{B[index], index});
        int low = 0;
    	int high = n - 1;
    	while(!pq.isEmpty()){
    		int[] curr = pq.poll();
    		int index = curr[1];
    		int val = curr[0];
    		if(A[high] > val) res[index] = A[high--];
    		else res[index] = A[low++];
    	}
        return res;
    }
}