class Solution {
    public int getSum(int a, int b) {
        int c;
        while(b != 0){
        	c = a&b;
        	a = a ^ b;
        	b = c << 1;
        }
        return a;
    }
}

// https://leetcode.com/problems/sum-of-two-integers/discuss/132479/Simple-explanation-on-how-to-arrive-at-the-solution