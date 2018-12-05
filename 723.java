class Solution {
    public int[][] candyCrush(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        boolean shouldContinue = false;

        // crush horizontally
        for(int i = 0; i < row; i++){
        	for(int j = 0; j < col - 2; j++){
        		int v = Math.abs(board[i][j]);
        		if(v > 0 && v == Math.abs(board[i][j + 1]) && v == Math.abs(board[i][j + 2])){
        			board[i][j] = board[i][j+1] = board[i][j+2] = -v;
        			shouldContinue = true;
        		}
        	}
        }

        // cursh vertically
        for(int j = 0; j < col; j++){
        	for(int i = 0; i < row - 2; i++){
        		int v = Math.abs(board[i][j]);
        		if(v > 0 && v == Math.abs(board[i+1][j]) && v == Math.abs(board[i+2][j])){
        			board[i][j] = board[i+1][j] = board[i+2][j] = -v;
        			shouldContinue = true;
        		}
        	}
        }

        // Drop vertically
        for(int j = 0; j < col; j++){
        	int r = row - 1;
        	for(int i = row - 1; i >= 0; i--){
        		if(board[i][j] >= 0) board[r--][j] = board[i][j]; // drop 
        	}
        	for(int i = r; i >= 0; i--) board[i][j] = 0; // set to 0
        }
        return shouldContinue ? candyCrush(board) : board;
    }
}