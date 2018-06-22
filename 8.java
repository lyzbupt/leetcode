class Solution {
    public int myAtoi(String str) {
    	int sign =1;
    	long result=0;
        for(int i=0; i<str.length(); i++){
        	if(str.charAt(i)==' '){
        		continue;
        	}
        	if(str.charAt(i)=='+')
        		continue;
        	else if(str.charAt(i)=='-'){
        		sign = -1 * sign;
        		continue;
        	}
        	if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        		result = result*10 + str.charAt(i)-'0';
        		if(result-Integer.MAX_VALUE > 0 && sign == 1)
        			return Integer.MAX_VALUE;
        		if(result-((long)Integer.MAX_VALUE +1)>0&& sign == -1)
					return Integer.MIN_VALUE;
        	}
        }
        return (int)result * sign;
    }
}