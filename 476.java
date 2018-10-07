class Solution {
    public int findComplement(int num) {
        int n = 0;
        while(Math.pow(2, n) < num){
        	n++;
            if(n == 31){
                return 2147483647 - num;
            }
        }
        return (int)Math.pow(2, n) - num == 0 ? num -1 : (int)Math.pow(2, n) - num -1;
    }
}


//https://leetcode.com/problems/number-complement/discuss/96018/Java-very-simple-code-and-self-evident-explanation

/*
 public int findComplement(int num) 
    {
        int i = 0;
        int j = 0;
        
        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }
        
        return i - num;
    }
*/