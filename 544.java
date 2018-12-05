class Solution {
    public String findContestMatch(int n) {
        String[] match = new String[n];
        for(int i = 0; i < n; i++){
        	match[i] = String.valueOf(i + 1);
        }

        while(n > 1){
        	for(int i = 0; i < n / 2; i++){
        		match[i] = "(" + match[i] + "," + match[n - i - 1] + ")";
        	}
        	n /= 2;
        }
        return match[0];
    }
}