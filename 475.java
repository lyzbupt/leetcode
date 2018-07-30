class Solution{
	public int findRadius(int[] houses, int[] heaters){
		Arrays.sort(houses);
		Arrays.sort(heaters);

		int i = 0;
		int res = 0;
		for(int house : houses){ // for each house, find it nestest heater
			while(i < heaters.length-1 && Math.abs(heaters[i+1] - house) <=Math.abs(heaters[i] - house)){
				i++;
			}
			res = Math.max(res, Math.abs(heaters[i]-house));
		}
		return res;
	}
}

// https://leetcode.com/problems/heaters/discuss/95881/Simple-Java-Solution-with-2-Pointers