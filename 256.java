class Solution {
    public int minCost(int[][] costs) {
        int result = 0;
        if(costs.length == 0) return result;
        int[] Last,cur = new int[3];
        Last = costs[0];
        for(int i = 1; i < costs.length; i++){
        	cur[0] = Math.min(Last[1],Last[2]) + costs[i][0];
        	cur[1] = Math.min(Last[0],Last[2]) + costs[i][1];
        	cur[2] = Math.min(Last[1],Last[0]) + costs[i][2];
        	Last[0] = cur[0];
        	Last[1] = cur[1];
        	Last[2] = cur[2];
        }

        return Math.min(Math.min(Last[0],Last[1]),Last[2]);
    }
}