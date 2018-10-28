class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int nr = grid.length;
        int nc = grid[0].length;
        int res = 0;

        for(int row = 0; row < nr; row++){
        	for(int col = 0; col < nc; col++){
        		if(grid[row][col] == '1'){  // find a island, begin to BFS
        			res++;
        			grid[row][col] = '0'; // marked as visited
        			Queue<Integer> neighbors = new LinkedList<Integer>();
        			neighbors.add(row * nc + col);
        			while(!neighbors.isEmpty()){
        				int id = neighbors.remove();
        				int r = id/nc;
        				int c = id%nc;
        				if(r - 1>=0 && grid[r-1][c] == '1'){
        					neighbors.add((r-1)*nc + c);
        					grid[r-1][c] = '0';
        				}
        				if(r+1<nr && grid[r+1][c] == '1'){
        					neighbors.add((r+1)*nc + c);
        					grid[r+1][c] = '0';
        				}
        				if(c-1 >=0 && grid[r][c-1]=='1'){
        					neighbors.add(r*nc+(c-1));
        					grid[r][c-1] = '0';
        				}
        				if(c+1 < nc && grid[r][c+1] == '1'){
        					neighbors.add(r*nc + (c+1));
        					grid[r][c+1] = '0';
        				}
        			}
        		}
        	}
        }
        return res;
    }
}
// https://leetcode.com/problems/number-of-islands/solution/