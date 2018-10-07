class Solution {
    public String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOPqwertyuiop","ASDFGHJKLasdfghjkl","ZXCVBNMzxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
        	for(char c: strs[i].toCharArray()){
        		map.put(c,i);
        	}
        }
        List<String> res = new LinkedList<>();
        for(String word : words){
        	if(word.equals("")) continue;
        	int index = map.get(word.charAt(0));  // index = 0, 1, 2
        	for(char c : word.toCharArray()){
        		if(map.get(c) != index){
        			index = -1;
        			break;
        		}
        	}
        	if(index != -1) res.add(word);
        }
        return res.toArray(new String[0]);
    }
}
// https://leetcode.com/problems/keyboard-row/discuss/97870/Short-Easy-Java-with-Explanation