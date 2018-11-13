class Solution {
    public int repeatedStringMatch(String A, String B) {
        int res = 1;
        StringBuilder sb = new StringBuilder(A);
        for(; sb.length() < B.length(); res++) sb.append(A);
        if(sb.indexOf(B) >= 0) return res;
    	if(sb.append(A).indexOf(B) >=0) return res+1;
    	return -1;
    }
}