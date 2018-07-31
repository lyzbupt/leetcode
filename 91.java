class Solution{
	public int numDecodings(String s){
		if(s == null || s.length() == 0){
			return 0;
		}
		char[] c = s.toCharArray();
		int[] dp = new int[c.length];
		dp[0] = c[0]>'0' ? 1:0;
		for(int i=1; i<dp.length;i++){
			if(c[i] > '0'){
				dp[i] = dp[i-1];
			}
			if(c[i-1]>'0' && ((c[i-1]-'0')*10 + (c[i]-'0') <=26)){
				dp[i]+= i-2 >=0 ? dp[i-2] : 1;
			}
		}
		return dp[s.length() -1];
	}
}

// https://leetcode.com/problems/decode-ways/discuss/30358/Java-clean-DP-solution-with-explanation