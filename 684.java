
class Solution{
	public int[] findRedundantConnection(int[][] edges){
		int[] parent = new int[2001];
		for(int i =0; i< parent.length;i++){
			parent[i] = i;
		}
		for(int[] edge : edges){
			int p1 = find(parent, edge[0]);
			int p2 = find(parent, edge[1]);

			if(p1 ==p2){
				return edge;
			}
			else{
				parent[p1] = p2;
			}
		}
		return new int[2];
	}
	private int find(int[] parent, int vertex){
		if(vertex != parent[vertex]){
			parent[vertex] = find(parent, parent[vertex]); 
		}
		return parent[vertex];
	}
}

/*

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        HashSet set = new HashSet<Integer>();
        int[] res = new int[2]; 
        for(int[] edge : edges){
        	if(set.contains(edge[0] && set.contains(edge[1])))
        		return edge;
        	else{
        		set.add(edge[0]);
        		set.add(dege[1]);
        	}
        }
    }
}

*/