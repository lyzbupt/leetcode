class Solution {
	int count;
    public int countComponents(int n, int[][] edges) {
        if(n<1) return 0;
        int[] roots = new int[n];
        count = n;
        for(int i = 0; i < n ; i++) roots[i] = i;
        for(int[] edge : edges){
        	union(roots, edge[0], edge[1]);
        }
        return count;
    }
    private void union(int[] roots, int edge1, int edge2){
    	int root1 = find(roots, edge1);
    	int root2 = find(roots, edge2);
    	if(root1 != root2){
    		roots[root1] = root2;
    		count--;
    	} 
    }
    private int find(int[] roots, int id){
    	if(roots[id] == id) return id;
    	return roots[id] = find(roots, roots[id]);
    	/*
    	while(roots[id] != id){
    		roots[id] = roots[roots[id]];
    		id = roots[id];
    	}
    	return id;
    	*/
    }
}