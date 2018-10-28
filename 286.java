class Solution {
    public void wallsAndGates(int[][] rooms) {
        if(rooms.length == 0 || rooms[0].length == 0) return;
        Queue<Integer> queue = new LinkedList<Integer>();
        int R = rooms.length;
        int C = rooms[0].length;
        for(int i = 0; i < R; i++){
        	for(int j = 0; j < C; j++){
        		if(rooms[i][j] == 0) queue.add(i*C + j);
        	}
        }
        while(!queue.isEmpty()){
        	int index = queue.poll();
        	int row = index/C;
        	int col = index%C;
        	if(row -1 >= 0 && rooms[row-1][col] == Integer.MAX_VALUE){
        		rooms[row-1][col] = rooms[row][col] + 1;
        		queue.add((row-1)*C+col);
        	}
        	if(row+1 < R && rooms[row+1][col] == Integer.MAX_VALUE){
        		rooms[row+1][col] = rooms[row][col] + 1;
        		queue.add((row+1)*C+col);
        	}
        	if(col - 1 >= 0&& rooms[row][col-1] == Integer.MAX_VALUE){
        		rooms[row][col-1] = rooms[row][col] + 1;
        		queue.add(row*C + col-1);
        	}
        	if(col + 1< C && rooms[row][col+1] == Integer.MAX_VALUE){
        		rooms[row][col+1] = rooms[row][col] + 1;
        		queue.add(row*C + col+1);
        	}
        }
    }
}