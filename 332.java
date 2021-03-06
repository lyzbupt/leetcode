class Solution {
	Map<String, PriorityQueue<String>> flights;
	LinkedList<String> path;

    public List<String> findItinerary(String[][] tickets) {
    	flights = new HashMap<>();
    	path = new LinkedList<>();
    	for(String[] ticket : tickets){
    		flights.putIfAbsent(ticket[0], new PriorityQueue<>());
    		flights.get(ticket[0]).add(ticket[1]);
    	}    
    	dfs("JFK");
    	return path;
    }
    private void dfs(String departure){
    	PriorityQueue<String> arrivals = flights.get(departure);
    	while(arrivals != null && !arrivals.isEmpty()){
    		dfs(arrivals.poll());

    	}
    	path.addFirst(departure);
    }
}
//https://leetcode.com/problems/reconstruct-itinerary/discuss/78766/Share-my-solution

JFK -> ATL,SFO
SFO -> ATL, 
ATL -> JFK, SFO

SFO,,ATL,SFO,JFK,ATL,JFK,

JFK -> KUL, NRT
NRT -> JFK

JFK,NRT,JFK,,KUL
