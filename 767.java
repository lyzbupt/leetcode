class Solution {
    public String reorganizeString(String S) {
        int len = S.length();
        int[] chars = new int[26];
        for(char c : S.toCharArray()) chars[c - 'a'] += 100;
        for(int i = 0; i < 26; i++) chars[i] += i;
        
        Arrays.sort(chars);
    	if(chars[25] / 100 > (len+1)/2) return "";
    	
    	char[] ans = new char[len];
    	int index = 0;
    	for(int i = 25; i >= 0; i--){
    		int code = chars[i];
    		int num = code / 100;
    		char c = (char)('a' + (code % 100));
    		for(int j = 0; j < num; j++){
    			if(index >= len) index = 1;
    			ans[index] = c;
    			index += 2; 
    		}
    	}
    	return String.valueOf(ans);
    }
}