class Solution {
    public int maxA(int N) {
        int[] best = new int[N+1];
        for(int i = 1; i <= N; i++){
        	best[i] = best[i - 1] + 1;
        	for(int j = 0; j < i-1; j++){
        		best[i] = Math.max(best[i], best[j] * (i - j -1));
        	}
        }
        return best[N];
    }
}