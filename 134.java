class Solution{
	public int canCompleteCircuit(int[] gas, int[] cost){
		int[] fuel = new int[gas.length];  // save difference
		int start = 0;
		int sum = 0;
		// first trip, find start point
		for(int i=0; i<gas.length;i++){
			fuel[i] = gas[i] - cost[i];
			sum+=fuel[i];
			if(sum<0){
				sum = 0;
				start = i+1;
				if(start == gas.length){  
					return -1;  // no solution, total gas < total cost
				}
			}
		}
		// start from beginning, check it is OK or not
		for(int i=0; i<start;i++){
			sum+=fuel[i];
			if(sum<0){
				return -1;  // start point fail
			}
		}
		return start;
	}
}