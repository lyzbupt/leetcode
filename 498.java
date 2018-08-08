class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
  		if(matrix == null || matrix.length ==0|| matrix[0].length==0)
  			return new int[0];

  		int m = matrix.length;
  		int n = matrix[0].length;

  		int[] res = new int[m*n];
  		int num = 0;
  		boolean flip = true;
  		for(int i = 0; i < n+m-1 ; i++){
  			
  			int mm, nn;
			// 偶数，从下往上
			if(flip == true){
				mm = Math.min(i, m-1);   // 
				nn = i - mm;
				while(mm >= 0 && nn < n){
					res[num++] = matrix[mm--][nn++];
				}
			}
			else{  // 奇数，从上往下
				nn = Math.min(i, n-1);
				mm = i - nn;
				while(nn >=0 && mm < m){
					res[num++] = matrix[mm++][nn--];
				}
			}
			flip = !flip;
  		}	 
  		return res;     
    }
}

/*
https://leetcode.com/problems/diagonal-traverse/discuss/97756/Java-solution-easy-to-understand-O(n)-7ms/163021
public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0)
            return new int[0];
        int c = matrix[0].length, r = matrix.length;
        int[] res = new int[r*c];
        boolean flip = true;
        int count = 0;
        for(int sum = 0; sum <= r + c - 2; sum++){
            int rr,cc;
            if(flip == true){                               // Direction: to up-right
                rr = Math.min(sum, r-1);                    // if before diagonal, rr = sum; else rr = r-1
                cc = sum - rr;
                while(rr >= 00 && cc < c)                   // reach matrix upper or right bound
                    res[count++] = matrix[rr--][cc++];
            }
            else{                                           // Direction: to bottom-left
                cc = Math.min(sum, c-1);                    // if before diagonal, cc = sum; else cc = c-1
                rr = sum - cc;
                while(cc >= 00 && rr < r)                   // reach matrix bottom or left bound
                    res[count++] = matrix[rr++][cc--];
            }
            flip = !flip;           
        }
        return res;
    }
}

*/