class Solution{
	public void gameOfLife(int[][] board){
		if(board == null || board.length == 0) return;
		int row = board.length;
		int col = board[0].length;

		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				// check next status is live or dead
				// in the beginning, every next status is 0, we don't need to consider "next status = dead"
				int lives = liveNeighbors(board, row, col ,i, j); // check how many live neighbor is around this one
				if(board[i][j]==1 && lives >= 2 && lives<=3){ // this one lives and around lives between[2,3]
					board[i][j] =3; // 3 = 11
				}
				if(board[i][j] == 0 && lives ==3){
					board[i][j] = 2; // 2 = 10
				}

			}
		}
		// change the board to 2nd state
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				board[i][j] >>= 1; 
			}
		}
	}
	public int liveNeighbors (int[][] board, int row, int col, int i, int j) {
		int lives = 0;
		for(int x = Math.max(i-1,0); x <= Math.min(i+1, row -1); x++){
			for(int y = Math.max(j-1,0); y<=Math.min(j+1,col-1);y++){
				lives += board[x][y] & 1;
			}
		}
		lives -= board[i][j] & 1;
		return lives;
	}

}