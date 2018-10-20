class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int res;
        if(triangle == null) return 0;
        int n = triangle.size();
        int[] dp = new int[n];
        dp[0] = triangle.get(0).get(0);
        int temp;                  // temp is used as cache to store dp[j]
        for(int i = 1; i < n; i++){
        	temp = dp[0];
        	for(int j = 0; j <= i; j++){
        		if(j==0){
        			dp[0] += triangle.get(i).get(j);
        		}else if(j<i){
        			int k = dp[j]; 
        			dp[j] = triangle.get(i).get(j) + Math.min(temp,dp[j]);
        			temp = k;
        		}else{
        			dp[j] = temp + triangle.get(i).get(j);
        		}
        	}
        	// System.out.println(dp[0]+" "+dp[1]+" "+dp[2]+" "+dp[3]);
        }
        res = dp[0];  
        for(int i = 1; i < n; i++){   // find the min result
        	if(dp[i] < res) res = dp[i];
        }
        return res;
    }
}