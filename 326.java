

class Solution{
	public boolean isPowerOfThree(int n){
		return (n>0 && 1162261467%n == 0);
	}
}


class Solution {
    public boolean isPowerOfThree(int n) {
        while(n > 1 && n % 3 == 0){
        	n = n / 3;
        }
        return n == 1 ? true : false;
    }
}