class Solution {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        if(s.length()!=t.length()) return false;
        for(char c : charS){
        	map[c-'a']++;
        }
        for(char c : charT){
        	if(map[c-'a']-- == 0){
        		return false;
        	}
        }
        return true;
    }
}