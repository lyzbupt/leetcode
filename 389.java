class Solution{
	public char findTheDifference(String s, String t){
		char[] arrayS = s.toCharArray();
		char[] arrayT = t.toCharArray();
		int asciiS = 0;
		int asciiT = 0;
		for(int i = 0; i < arrayS.length;i++){
			asciiS += (int)arrayS[i];
		}
		for(int i = 0; i < arrayT.length;i++){
			asciiT += (int)arrayT[i];
		}
		return (char)(asciiT - asciiS);
	}
}





class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
        	if(map.containsKey(s.charAt(i))){
        		map.replace(s.charAt(i),map.get(s.charAt(i)) + 1);
        	}else{
        		map.put(s.charAt(i),1);
        	}
        }
        for(int i = 0; i < t.length(); i++){
        	if(map.containsKey(t.charAt(i))){

        		map.replace(t.charAt(i),map.get(t.charAt(i)) - 1);
				if(map.get(t.charAt(i)) == -1)
					return t.charAt(i);
        	}else{
        		return t.charAt(i);
        	}
        }return 'a';

    }
}