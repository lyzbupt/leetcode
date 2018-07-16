class Solution{
	public List<Integer> findAnagrams(String s, String p){

		List<Integer> result = new ArrayList<>();
		if(s == null || p == null || s.length() < p.length())
			return result;

		int[] charsP = new int[26];
		for(char c : p.toCharArray())
			charsP[c-'a']++;

		int start = 0;
		int end = 0;
		int count = p.length();

		while(end < s.length()){
			if(end - start == p.length()){
				if(charsP[s.charAt(start)-'a']>=0)
					count++;
				charsP[s.charAt(start)-'a']++;
				start++;
			}
			charsP[s.charAt(end)-'a']--;
			if(charsP[s.charAt(end)-'a']>=0){
				count--;
			}
			if(count == 0){
				result.add(start);
			}
			end++;
		}

		return result;
	}
}