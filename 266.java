class Solution {
    public boolean canPermutePalindrome(String s) {
        HashSet<Character> set = new HashSet<Character>(26);
        for(int i=0; i<s.length();i++){
        	if(set.contains(s.charAt(i)))
        		set.remove(s.charAt(i));
        	else
        		set.add(s.charAt(i));
        }
        if(set.size()>1)
        	return false;
        return true;
    }
}