/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
    	int ans=0;
    	while(n>0){
	    	int num = read4(buf);
	        if(n<=num){
	        	return ans+n;
	        }else if(n<=4){
	        	return ans+num;
	        }
	        else{
	        	ans=ans+4;
	        	n=n-4;
	        }
    	}
        return 0;

    }
}å