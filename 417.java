class Solution {
    public List<int[]> pacificAtlantic(int[][] matrix) {
    	List< int[] > res = new LinkedList<>();
		if(matrix == null ||matrix.length==0||matrix[0].length==0) return res;
        int row = matrix.length;
        int col = matrix[0].length;
        

        boolean[][] visitedP = new boolean[row][col];
        boolean[][] visitedA = new boolean[row][col];
        for(int i = 0; i < row; i++){
        	dfs(visitedP, matrix, i, 0 , -1);
        	dfs(visitedA, matrix, i, col-1, -1);
        }
        for(int i =0; i < col; i++){
        	dfs(visitedP, matrix, 0,i,-1);
        	dfs(visitedA, matrix, row-1, i, -1);
        }
        for(int i = 0; i < row; i++){
        	for(int j = 0; j < col; j++){
        		if(visitedA[i][j]&&visitedP[i][j])
        			res.add(new int[] {i,j});
        	}
        }
        return res;
    }

    int[][] dirs = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    private void dfs(boolean[][] visited , int[][] matrix, int i, int j, int preHight){
    	if(i<0 || j <0 || i >= matrix.length || j >= matrix[0].length || visited[i][j]||matrix[i][j] < preHight)
    		return;
    	visited[i][j] = true;
    	for(int[] d : dirs)
    		dfs(visited, matrix, i + d[0], j+d[1], matrix[i][j]);
    }
}