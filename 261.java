class Solution{
	public boolean validTree(int n, int[][] edges){
		if(n < 1) return false;
		Map<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
		for(int i = 0; i < n ; i++){
			map.put(i, new HashSet<Integer>());
		}
		// visit all edge and put them in map 
		for(int i = 0; i<edges.length;i++){
			map.get(edges[i][0]).add(edges[i][1]);
			map.get(edges[i][1]).add(edges[i][0]);
		}

		// bfs
		Set<Integer> visited = new HashSet<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		while(!queue.isEmpty()){
			int current = queue.poll();
			if(visited.contains(current)) return false;
			for(int node : map.get(current)){
				queue.add(node);
				map.get(node).remove(current);
			}
			visited.add(current);
		}
		return visited.size()==n;
	}
}