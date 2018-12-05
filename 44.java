class Solution {
    public boolean isMatch(String s, String p) {
       int sIndex = 0, pIndex = 0, match = 0, starIndex = -1;
       while(sIndex < s.length()){
       		if(pIndex < p.length() && (p.charAt(pIndex) == '?' || 
       			s.charAt(sIndex) == p.charAt(pIndex))){
       			sIndex++;
       			pIndex++;
       		}
       		else if(pIndex < p.length() && p.charAt(pIndex) == '*'){
       			starIndex = pIndex;
       			pIndex++;
       			match = sIndex;
       		}
       		else if(starIndex != -1){
       			pIndex = starIndex + 1;
       			match++;
       			sIndex = match;
       		}
       		else
       			return false;
       }
       while(pIndex < p.length() && p.charAt(pIndex) == '*') pIndex++;

       return pIndex == p.length();
    }
}