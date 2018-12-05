class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < S.length(); i++){
        	last[S.charAt(i) - 'a'] = i;
        }
        for(int i = 0; i < S.length(); i++){
        	int start = i;
        	int anchor = last[S.charAt(i) - 'a']; 
        	for(; i < anchor; i++){
        		if(last[S.charAt(i) - 'a'] > anchor){
        			anchor = last[S.charAt(i) - 'a'];		
        		}
        	}
        	res.add(i - start + 1);
        }
        return res;
    }
}