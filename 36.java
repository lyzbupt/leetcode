class Solution{
	public boolean isValidSudoku(char[][] board){
		int n = board.length;   // row number
		int m = board[0].length;  // column number

		boolean[][] rows = new boolean[n][m];
		boolean[][] cols = new boolean[n][m];
		boolean[][][] boxes = new boolean[n/3][n/3][n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m;j++){
				if(board[i][j]!='.'){
					int index = board[i][j]-'1';
					if(rows[i][index]||cols[j][index]||boxes[i/3][j/3][index]){
						return false;
					}
					rows[i][index] = true;
					cols[j][index] = true;
					boxes[i/3][j/3][index] = true;
				}
			}
		}
		return true;
	}
}