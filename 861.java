class Solution{
	public int matrixScore(int[][] A){
		int row = A.length;
		int col = A[0].length;
		int res = 0;
		for(int c = 0; c < col; c++){
			int count = 0;
			for(int r = 0; r < row; r++){
				count += A[r][0] ^ A[r][c];
			}
			res += Math.max(count, row - count) * (1 << col - 1 - c);
		}
		return res;
	}
}