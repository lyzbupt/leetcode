class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet jewels = new HashSet<Character>();
        int count = 0;
        for(char j : J.toCharArray()){
        	jewels.add(j);
        }
        for(char s : S.toCharArray()){
        	if(jewels.contains(s)){
        		count++;
        	}
        }
        return count;
    }
}