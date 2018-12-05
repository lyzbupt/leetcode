class Result{
	public static int findMaxHeight(int N, List<Integer> buildings, List<Integer> heights){
		if(N <= 1) return 0;
		int res = -1;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < buildings.size(); i++){
			map.put(buildings.get(i)-1, heights.get(i));
		}
		int Max = 0;
		for(int i = 0; i < N; i++){
			res++;
			if(map.containsKey(i)){
				if( res > map.get(i)){
					Max = Math.max(Max, (res + map.get(i)) >> 1);
					res = map.get(i);
				}
			}
		}
		return Math.max(Max, res);
	}
}