class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
    	/*
    	HashSet<String> set = new HashSet<String>(); 
    	for(String w : wordDict){
    		set.add(w);
    	}
    	*/
        return DFS(s, wordDict, new HashMap<String, LinkedList<String>>());
    }
    private List<String> DFS(String s, List<String> wordDict, HashMap<String, LinkedList<String>> map){
    	if(map.containsKey(s))
    		return map.get(s);
    	LinkedList<String> res = new LinkedList<String>();
    	if(s.length() == 0){
    		res.add("");
    		return res;
    	}
    	for(String w : wordDict){
    		if(s.startsWith(w)){
    			List<String> sublist = DFS(s.substring(w.length()),wordDict, map);
    			for(String sub : sublist){
    				res.add(w + (sub.isEmpty() ? "" : " ")+sub);
    			}
    		}
    	}
    	map.put(s, res);
    	return res;
    }
}
// https://leetcode.com/problems/word-break-ii/discuss/44167/My-concise-JAVA-solution-based-on-memorized-DFS

// https://leetcode.com/problems/word-break-ii/solution/


