class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Pascal_List = new ArrayList<List<Integer>>();
        generateList(Pascal_List , numRows);
        return Pascal_List;
    }

    private void generateList(List<List<Integer>> Pascal_List , int numRows){
    	if(numRows == 0)
    		return;
    	if(numRows == 1){
    		Pascal_List.add(new ArrayList<>());
    		Pascal_List.get(0).add(1);
    		return;
    	}
    	generateList(Pascal_List , numRows-1);

    	List<Integer> list = new ArrayList<Integer>();
    	List<Integer> prelist = Pascal_List.get(numRows-2);
    	list.add(1);    	
    	for(int i =2; i<numRows;i++){
    	
    		list.add(prelist.get(i-2)+prelist.get(i-1));
    	}

    	list.add(1); 
    	Pascal_List.add(list);
    }
}