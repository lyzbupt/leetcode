class Solution {
    public int titleToNumber(String s) {
        int len = s.length();
        int ans = 0;
        for (int i =0; i< len;i++){
        	 int j = ((int) (s.charAt(i) -'A')) +1;
        	 ans+= j * Math.pow(26,len-i-1);
        }


        return ans;
    }
}