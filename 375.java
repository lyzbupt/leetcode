class Solution{
	public int getMoneyAmount(int n){
		int[][] dp = new int[n+1][n+1];
		for(int j = 1; j <= n; j++){
			for(int i = j; i >= 1; i--){
				if(i == j) dp[i][j] = 0;
				else if(i + 1 == j) dp[i][j] = i;
				else{
					dp[i][j] = Integer.MAX_VALUE;
					for(int k = i+1; k < j; k++){
						dp[i][j] = Math.min(dp[i][j], k + Math.max(dp[i][k-1], dp[k+1][j]));
					}
				}
			}
		}
		return dp[1][n];
	}
}


/*
class Solution {
    public int getMoneyAmount(int n) {
       int[][] dp = new int[n+1][n+1];
       for(int j = 2; j <= n; j++){
       		for(int i = j - 1; i > 0; i--){
       			int globalMin = Integer.MAX_VALUE;
       			for(int k = i+1; k < j; k++){
       				int localMax = k + Math.max(dp[i][k-1], dp[k+1][j]);
       				globalMin = Math.min(globalMin, localMax);
       			}
       			dp[i][j] = i+1 == j ? i : globalMin;
       		}
       }
       return dp[1][n];
    }
}
*/

// 10, -> 5, 8, 9
// 1 -> 0
// 2 -> 1
// 3 -> 2
// 4 -> 3, 1
// 5 -> 3, 4
// 6 -> 3, 5
// 7 -> 4, 6
// 9 -> 14