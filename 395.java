class Solution {
    public int longestSubstring(String s, int k) {
        char[] str = s.toCharArray();
        int[] counts = new int[26];
        int h, i, j, index, unique, noLessThanK;
        int max = 0;
        
        for(h = 1; h <= 26; h++){
        	Arrays.fill(counts, 0);
        	i = 0;
        	j = 0;
        	unique = 0;
        	noLessThanK = 0;

        	while( j < str.length){ // go through whole string
        		
        		if(unique <= h){ // move forward
        			index = str[j] - 'a';
        			if(counts[index] == 0) unique++;
        			counts[index]++;
        			if(counts[index] == k) noLessThanK++;
        			j++;
        		}
        		else{
        			index = str[i] - 'a';
        			if(counts[index] == k) noLessThanK--;
        			counts[index]--;
        			if(counts[index] == 0) unique--;
        			i++;
        		}
        		if(unique == h && unique == noLessThanK){ // all c in T, are no less than k
        			max = Math.max(j-i, max);
        		}
        	}

        }
        return max;
    }
}