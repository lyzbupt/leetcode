class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        int res = 0;
        int indexI = 0;
        if(matrix == null || matrix.length == 0 || k ==0) return res;
        for(int j = 0; j< matrix[0].length; j++){
        	queue.offer(new int[]{matrix[indexI][j], indexI, j});
        }
        while(k-- > 0 && !queue.isEmpty()){
        	int[] curr = queue.poll();
        	indexI = curr[1] + 1;
        	res = curr[0];
        	if(indexI == matrix.length) continue;
        	queue.add(new int[]{matrix[indexI][curr[2]], indexI, curr[2]});
        }
        return res;
    }
}