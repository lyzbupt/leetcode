// MinHeightTrees

class Solution{
	public List<Integer> findMinHeightTrees(int n, int[][]edges){
		if(n==1){
			return Collections.singletonList(0);
		}
		// store all edge states
		List<Set<Integer>> edgeMap = new ArrayList<>(n);
		for(int i = 0; i<n; i++){
			edgeMap.add(new HashSet<>());
		}
		for(int[] edge: edges){
			edgeMap.get(edge[0]).add(edge[1]);
			edgeMap.get(edge[1]).add(edge[0]);
		}
		// find all leaves
		List<Integer> leaves = new ArrayList<>();
		for(int i = 0; i<n; i++){
			if(edgeMap.get(i).size() == 1){
				leaves.add(i);
			}
		}
		while(n>2){
			n -= leaves.size();
			List<Integer> newLeaves = new ArrayList<>();
			for(int i : leaves){
				int node = edgeMap.get(i).iterator().next();
				edgeMap.get(node).remove(i);  // delete all leaves
				if(edgeMap.get(node).size() == 1)  
					newLeaves.add(node);   // find new leaves
			}
			leaves = newLeaves; 
		}
		return leaves;
	}
}