class Solution {
    public int maxKilledEnemies(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0)  return 0;
        int row = grid.length;
        int col = grid[0].length;
        int max = 0;
        int[][] dp = new int[row+1][col+1];
        for(int i = 0; i < row; i++){
        	int count = 0;
        	for(int j = 0; j < col; j++){
        		if(grid[i][j] == '0') dp[i][j] = count;
        		else if(grid[i][j] == 'E'){
        			count++;
        		}else{
        			count = 0;
        		}
        	}
        	count = 0;
        	for(int j = col - 1; j >= 0; j--){
        		if(grid[i][j] == '0'){
        			dp[i][j] += count;
        		}else if(grid[i][j] == 'E'){
        			count++;
        		}else{
        			count = 0;
        		}
        	}
        }
        // travel each row twice: from top and from bottom
        for(int i = 0; i < col; i++){
        	int count = 0;
        	for(int j = 0; j < row; j++){
        		if(grid[j][i] == '0'){
        			dp[j][i] += count;
        		}else if(grid[j][i] == 'E'){
        			count++;
        		}else{
        			count = 0;
        		}
        	}
        	count = 0;
        	for(int j = row - 1; j >= 0; j--){
        		if(grid[j][i] == '0'){
        			dp[j][i] += count;
        			max = Math.max(max, dp[j][i]);
        		}else if(grid[j][i] == 'E'){
        			count++;
        		}else{
        			count = 0;
        		}
        	}
        }
        return max;
    }
}