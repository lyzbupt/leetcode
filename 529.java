// DFS

class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        int m = board.length, n = board[0].length;
        int row = click[0], col = click[1];

        if(board[row][col] == 'M') board[row][col] = 'X';
        else{
        	int count = 0;
        	for(int i = -1; i < 2; i++){
        		for(int j = -1; j < 2; j++){
        			if(i == 0 && j == 0) continue;
        			if(row + i < 0 || row + i >= m || col + j < 0 || col + j >=n)
        				continue;
        			if(board[row+i][col+j] == 'M' || board[row+i][col+j] == 'X')
        				count++;
        		}
        	}
        	if(count > 0) board[row][col] = (char)(count + '0');
        	else{
        		board[row][col] = 'B';
        		for(int i = -1; i < 2; i++){
	        		for(int j = -1; j < 2; j++){
	        			if(i == 0 && j == 0) continue;
	        			if(row + i < 0 || row + i >= m || col + j < 0 || col + j >=n)
	        				continue;
	        			if(board[row + i][col + j] == 'E')
	        				updateBoard(board, new int[]{row+i, col+j});
	        		}
        		}
        	}
        }
        return board;
    }
}