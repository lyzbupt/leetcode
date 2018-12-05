/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
    	boolean flag = true; // end of file flag
        int total = 0;
        char[] temp = new char[4]; // to store read buf, the data destination

        while(flag && total < n){
            int count = read4(temp);
            flag = count >= 4;
            // get the actutal count
            count = Math.min(count, n - total);
            // copy from temp buffer to buf 
            for(int i = 0; i < count; i++){
                buf[total++] = temp[i];
            }
        }
        return total;
    }
}