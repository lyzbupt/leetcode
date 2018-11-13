class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if( n == 0) return 1;
        if(n == 1) return 10;
        if(n >= 10) return 8877691;
        int curr = 81;
        int total = 91;
        for(int i = 3; i <=n ; i++){
        	curr *= (11-i);
        	total += curr;
        }
        return total;
    }
}