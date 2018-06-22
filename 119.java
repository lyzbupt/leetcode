class Solution{
	public List<Integer> getRow(int rowIndex){
		Integer[] list = new Integer[rowIndex+1];
		list[0] = 1;
		long pre = 0;
		for (int k=1; k<=rowIndex; k++){
			pre = list[k-1]*(rowIndex+1-k)/k;
			list[k] = (int)pre;
		}
		return Arrays.asList(list);
	}
}