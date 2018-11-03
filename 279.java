class Solution{
	public int numSquares(int n){
		int[] dp = new int[n+1];
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i = 1; i <= n; i++){
			int j = 1;
			int min = Integer.MAX_VALUE;
			while(i - j*j >=0){
				min = Math.min(min, dp[i-j*j]+1);
				j++;
			}
			dp[i] = min;
		}
		return dp[n];
	}
}


/*
class Solution {

    public int numSquares(int n) {
    	int resF = n;
	    List<Integer> list;
        list = new ArrayList<Integer>();
        int a = 1;
        while(a*a<=n){
        	list.add(a*a);
        	a++;
        }
        // int i = 
        for(int i =list.size(); i >=1; i--){
        	int res = 0;
        	int tempN = n;
        	int j = i;
        	while(tempN>0){
	        	if(list.get(j-1) == 1){
	        		tempN--;
	        		res++;
	        		
	        	}
	        	else if(tempN>=list.get(j-1)){
	        		 tempN = tempN - list.get(j-1);
	        		res++;
	        	}else{
	        		j--;
	        	}
        	}
        	System.out.println(res);
        	if(res < resF)

        		resF = res;
        }
        
        //helper(n);
        return resF;
    }
}
*/