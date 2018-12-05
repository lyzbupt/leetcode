class Solution {
    public String findLongestWord(String s, List<String> d) {
        String maxStr = "";
        for(String s2: d){
        	if(isSubsequence(s, s2)){
        		if(s2.length() > maxStr.length() || (s2.length() == maxStr.length() &&
        			s2.compareTo(maxStr) < 0))
        			maxStr = s2;
        	}
        }
        return maxStr;
    }

    private boolean isSubsequence(String s1, String s2){
    	int index = 0;
    	for(int i = 0; i < s1.length() && index < s2.length(); i++){
    		if(s1.charAt(i) == s2.charAt(index)) index++;
    	}
    	return index == s2.length();
    }
}

/*
class Solution {
    public String findLongestWord(String s, List<String> d) {
        d.sort((a,b) -> a.length() != b.length() ? b.length() - a.length():
        	a.compareTo(b));
        for(String s2: d){
        	if(isSubsequence(s, s2)) return s2;
        }
        return "";
    }

    private boolean isSubsequence(String s1, String s2){
    	int index = 0;
    	for(int i = 0; i < s1.length() && index < s2.length(); i++){
    		if(s1.charAt(i) == s2.charAt(index)) index++;
    	}
    	return index == s2.length();
    }
}
*/