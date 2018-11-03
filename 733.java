class Solution {
	int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length==0|| image[0].length == 0) return image;

        dfs(image, sr,sc,newColor, image[sr][sc]);
        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int newColor, int preColor){
    	if(sr<0|| sc<0|| sr>=image.length || sc >= image[0].length || image[sr][sc] == newColor) return;
    	if(image[sr][sc] != preColor) return;
    	image[sr][sc] = newColor;
    	for(int[] dir : dirs){
    		dfs(image, sr+dir[0], sc+dir[1], newColor, preColor);
    	}
    }
}