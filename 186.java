class Solution {
    public void reverseWords(char[] str) {
        if(str == null || str.length == 0) return;
        reverse(str, 0, str.length -1);
        int index = 0;
        for(int i = 0; i < str.length;i++){
        	if(str[i] == ' '){
        		reverse(str, index, i-1);
        		index = i+1;
        	}
        }
        reverse(str, index, str.length-1);
    }

    private void reverse(char[] str, int start, int end){
    	for(int i = start, j = end; i < j; i++, j--){
    		char temp = str[start];
    		str[start] = str[end];
    		str[end] = temp;
    	}
    }
}

class Solution {
    public void reverseWords(char[] str) {
        if(str == null || str.length == 0) return;
        reverse(str, 0, str.length -1);
        int index = 0;
        for(int i = 0; i < str.length;i++){
        	if(str[i] == ' '){
        		reverse(str, index, i-1);
        		index = i+1;
        	}
        }
        reverse(str, index, str.length-1);
    }

    private void reverse(char[] str, int start, int end){
        while(start <= end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}