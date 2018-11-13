class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        int subStrLen = 0;
        int subStrNum = 0;
        for(subStrLen = l/2; subStrLen>=1;subStrLen--){
        	if(l%subStrLen != 0) continue;
        	subStrNum = l / subStrLen;
        	String subStr = s.substring(0,subStrLen);
        	StringBuilder sb = new StringBuilder();
        	for(int j = 0; j < subStrNum; j++){
        		sb.append(subStr);
        	}
        	if(sb.toString().equals(s)) return true;
        }
     return false;
    }
}