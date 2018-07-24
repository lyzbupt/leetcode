// https://leetcode.com/problems/group-shifted-strings/discuss/67450/12-lines-Java-solution-with-explanation

class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strings){
        	String key = "";
        	char first = str.charAt(0);
        	for(char c:str.toCharArray()){
        		key += (c-first >= 0 ? c-first : c-first +26)+","; 
        	}
        	if(!map.containsKey(key)){  // 如果没有这个key，就加进去
        		map.put(key, new ArrayList<String>());
        	}
        	map.get(key).add(str);  // 把string 加到key里
        }
        for(String key:map.keySet()){
        	Collections.sort(map.get(key));
        }
        return new ArrayList<List<String>>(map.values());
    }
}