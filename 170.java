class TwoSum {
	private List<Integer> list = new ArrayList<Integer>();
	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    /** Initialize your data structure here. */
    public TwoSum() {
        
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
    	if(map.containsKey(number)){
    		map.put(number, map.get(number)+1);
    	}    
    	else{
    		list.add(number);
    		map.put(number, 1);
    	}
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for( int i : list){
        
        	int num2 = value - i;
        	if((i == num2 && map.get(i)>1) || ( i!= num2 && map.containsKey(num2)))
        		return true;
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */