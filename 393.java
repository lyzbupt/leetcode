class Solution {
    public boolean validUtf8(int[] data) {
        int n = 0;
        int mask1 = 1 << 7;
        int mask2 = 1 << 6;

        for(int i = 0; i < data.length; i++){
        	if(n == 0){
        		int mask = 1 << 7;
        		while((mask & data[i]) != 0){
        			n += 1;
        			mask = mask >> 1;
        		}
        		if(n == 0) continue; // this is a one byte characters
        		if(n > 4 || n == 1){
        			return false;
        		}
        	}else{
        		if((data[i] & mask1) == 0 || (data[i] & mask2) != 0) return false;
        	}
        	n--;
        }
        return n == 0;
    }
}