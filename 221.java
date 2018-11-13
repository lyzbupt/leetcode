class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        	return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int res = 0;
        int[][] dp = new int[row+1][col+1];
        for (int i = 1; i <= row; i++) {
        	for(int j = 1; j <= col; j++){
        		if(matrix[i-1][j-1] == '1'){
        			dp[i][j] = Math.min(dp[i-1][j-1], 
        				Math.min(dp[i-1][j], dp[i][j-1])) + 1; 
        		res = Math.max(res, dp[i][j]);
        		}
        	}
        }
        return res * res;
    }
}


class Solution{
	public int maximalSquare(char[][] matrix){
		if(matrix == null || matrix.length == 0|| matrix[0].length == 0){
			return 0;
		}
		int res = 0, pre = 0;
		int[] dp = new int[matrix[0].length+1];
		for(int i = 1; i <= matrix.length; i++){
			for(int j = 1; j <=matrix[0].length; j++){
				int temp = dp[j];
				if(matrix[i-1][j-1] == '1'){
					dp[j] = Math.min(pre, Math.min(dp[j-1], dp[j])) + 1;
					res = Math.max(res, dp[j]);
				}
				else{
					dp[j] = 0;
				}
				pre = temp;
			}
		}
		return  res * res;
	}
}