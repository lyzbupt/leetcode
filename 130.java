class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length==0||board[0].length==0) return;
        int row = board.length;
        int col = board[0].length;
        boolean[][] mark = new boolean[row][col];
        int i,j;
        Queue<Point> queue = new LinkedList<Point>();
        for(i = 0;i<row;i++){
        	for(j = 0;j<col;j++){
        		mark[i][j] = false;
        	}
        }
        // edge 
        for(i=0;i<row;i++){
        	if(board[i][0]=='O'){
        		mark[i][0] = true;
        		queue.add(new Point(i,0));
        	}

        	if(board[i][col-1]=='O'){
        		mark[i][col-1] = true;
        		queue.add(new Point(i,col-1));
        	}
        }
        for(j=1;j<col-1;j++){
        	if(board[0][j] =='O'){
        		queue.add(new Point(0,j));
        		mark[0][j] = true;
        	}
        	if(board[row-1][j] == 'O'){
        		queue.add(new Point(row-1,j));
        		mark[row-1][j] =true;
        	}
        }
        while(!queue.isEmpty()){
        	Point p = queue.poll();
        	int x = p.x;
        	int y = p.y;
        	if(x-1>=0 && board[x-1][y] == 'O'&&mark[x-1][y]==false){
        		mark[x-1][y] = true;
        		queue.add(new Point(x-1,y));
        	}
        	if(x+1<row && board[x+1][y] == 'O'&&mark[x+1][y]==false){
        		mark[x+1][y] = true;
        		queue.add(new Point(x+1,y));
        	}
        	if(y-1>=0 && board[x][y-1] == 'O'&&mark[x][y-1]==false){
        		mark[x][y-1] = true;
        		queue.add(new Point(x,y-1));
        	}
        	if(y+1<col && board[x][y+1] == 'O'&&mark[x][y+1]==false){
        		mark[x][y+1] = true;
        		queue.add(new Point(x,y+1));
        	}
        }
        for(i =0; i < row; i++){
        	for(j=0;j<col;j++){
        		if(mark[i][j] == false)
        			board[i][j] = 'X';
        	}
        }
    }
}