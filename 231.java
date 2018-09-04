class Solution {
    public boolean isPowerOfTwo(int n) {
    	if(n==0) return false;
        if(n==1) return true;
        if(n%2 == 0){
        	return isPowerOfTwo(n/2);
        }
        else return false;
    }
}

// https://leetcode.com/problems/power-of-two/discuss/63972/One-line-java-solution-using-bitCount/171686
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n) == 1;
    }
}