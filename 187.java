class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<Integer> words1 = new HashSet<>();
        Set<Integer> words2 = new HashSet<>();
        List<String> res = new ArrayList<>();
        char[] map = new char[26];
        map['A' - 'A'] = 0;
        map['C' - 'A'] = 1;
        map['G' - 'A'] = 2;
        map['T' - 'A'] = 3;

        for(int i = 0; i < s.length() - 9; i++){
        	int val = 0;
        	for(int j = i; j < i + 10; j++){
        		val = val << 2;
        		val = val | map[s.charAt(j) - 'A'];
        	}
        	if(!words1.add(val) && words2.add(val)){
        		res.add(s.substring(i, i + 10));
        	}
        }
        return res;
    }
}


class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    	if(s.length() < 11) return new ArrayList<>();
        Set<Integer> words1 = new HashSet<>();
        Set<Integer> words2 = new HashSet<>();
        List<String> res = new ArrayList<>();
        char[] map = new char[26];
        map['A' - 'A'] = 0;
        map['C' - 'A'] = 1;
        map['G' - 'A'] = 2;
        map['T' - 'A'] = 3;
        int val = 0;
        
        for(int i = 0; i < 10; i++){  // first value
    		val = val << 2;
    		val = val | map[s.charAt(i) - 'A'];
		}
		words1.add(val);

        for(int i = 1; i < s.length() - 9; i++){ 
    		val &= ~(3 << 18);
    		val = val << 2;
    		val = val | map[s.charAt(i+9) - 'A'];
        	if(!words1.add(val) && words2.add(val)){
        		res.add(s.substring(i, i + 10));
        	}
        }
        return res;
    }
}