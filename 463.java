class Solution {
    public int islandPerimeter(int[][] grid) {
        int landsNum = 0, neighbours = 0;
        if(grid == null || grid.length == 0)
        	return 0;
        for(int i = 0; i < grid.length; i++){
        	for(int j = 0; j < grid[0].length; j++){
        		if(grid[i][j] == 1){
        			landsNum ++;
        			if(i < grid.length - 1 && grid[i+1][j] == 1){ //  只查右边和下面，每有一个相邻就减去两个边
        				neighbours ++;
        			}
        			if(j < grid[0].length - 1 && grid[i][j+1] == 1){
        				neighbours ++;
        			}
        		}
        	}
        }
        return landsNum*4 - neighbours *2;
    }
}