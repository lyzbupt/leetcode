public class Solution{
	public void rotate(int[][] matrix){
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return;
		for(int i = 0;i<matrix.length;i++){
			for(int j = i; j<matrix[0].length;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(int i = 0; i<matrix.length;i++){
			for(int j = 0; j<matrix.length/2;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j] = temp;
			}
		}
	}

}
	


/*
	public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<matrix.length/2;i++){
            for(int j =i;j<n-i-1;j++){
                int temp =matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
*/