class Solution{
	public int firstUniqChar(String s){
		int[] map = new int[26];
		for(int i=0; i<s.length();i++){
			map[s.charAt(i)-'a']++;
		}
		int min = Integer.MAX_VALUE;
		for(int i=0; i<26;i++){
			if(map[i]==1){
				min = Math.min(min, s.indexOf(i + 'a'));
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}
}
