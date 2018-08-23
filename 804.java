class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] lib = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	HashSet set = new HashSet<String>();

    	for(String s : words){
    		String code = "";
    		for(char c : s.toCharArray()){
    			code += lib[c-'a'];
    		}
    		set.add(code);
    	}
    	return set.size();
    }
}