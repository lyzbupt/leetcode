class Solution{
	public int findCircleNum(int[][] M){
		int[] visited = new int[M.length];
		int count = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i =0; i < M.length; i++){
			if(visited[i] == 0){
				queue.offer(i);
				//System.out.println(i);
				count++;
				while(!queue.isEmpty()){
					int current = queue.poll();
					visited[current] = 1;
					for(int j = 0; j < M.length; j++){
						if(visited[j] == 0 && M[current][j] == 1){
							queue.offer(j);
							//System.out.println(j);
						}
					}
				}
			}
		}
		return count;
	}
}

 1 0 0 1
 0 1 1 0
 0 1 1 1
 1 0 1 1

/*
 class Solution{
 	public int findCircleNum(int[][] M){
 		int[] visited = new int[M.length];
 		int count = 0;
 		for(int i = 0; i < M.length; i++){
 			if(visited[i] == 0){
 				dfs(M, visited, i);
 				count++;
 			}
 		}
 		return count;
 	}

 	private void dfs(int[][] M, int[] visited, int i){
 		for(int j = 0; j < M.length; j++){
 			if(M[i][j] == 1 && visited[j] == 0){
 				visited[j] = 1;
 				dfs(M, visited, j);
 			}
 		}
 	}
 }
 */



 public class Solution{
 	int count;
 	public int findCircleNum(int[][] M){
 		count = M.length;
 		int[] roots = new int[M.length];
 		for(int i = 0; i<M.length; i++) roots[i] = i;
 		for(int i = 0; i < M.length;i++){
 			for(int j = 0; j < M.length; j++){
 				if(i!=j&&M[i][j] == 1)
 					union(roots, i ,j);
 			}
 		}
 		return count;
 	}
 	private void union(int roots[], int i, int j){
 		int index1 = find(roots, i);
 		int index2 = find(roots, j);
 		if(index1 != index2){
 			count--;
 			roots[index1] = index2;
 		}
 	}
 	private int find(int[] roots, int i){
 		if(roots[i] == i) return i;
 		return roots[i] = find(roots, roots[i]);
 	}
 }