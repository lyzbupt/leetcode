class Solution {
	int res = 0;
    public int totalNQueens(int n) {
        if(n <= 0) return res;
        search(new ArrayList<Integer>(), n);
        return res;
    }
    private void search(List<Integer> cols, int n){
    	if(cols.size() == n){
    		res++;
    		return;
   		}
   		for(int colIndex = 0; colIndex < n; colIndex++){
   			if(!isValid(cols, colIndex)) continue;
   			cols.add(colIndex);
   			search(cols, n);
   			cols.remove(cols.size() - 1);
   		}
    }

    private boolean isValid(List<Integer> cols, int column){
    	int row = cols.size();
    	for(int rowIndex = 0; rowIndex < cols.size(); rowIndex++){
    		if(cols.get(rowIndex) == column) return false;
    		if(rowIndex + cols.get(rowIndex) == row + column) return false;
    		if(rowIndex - cols.get(rowIndex) == row - column) return false;
    	}
    	return true;
    }
}