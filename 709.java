class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for(char s : str.toCharArray()){
        	if(s-'A' < 26 && s-'A'>=0){
        		s += 32;
        	}
    		sb.append(s);
        }
        return sb.toString();
    }
}