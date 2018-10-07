class Solution {
    public boolean detectCapitalUse(String word) {
    	if(word == null || word.length() == 0){
    		return false;
    	}
        boolean first = false;
        int upper = 0;
        int lower = 0;
        char[] wordArray = word.toCharArray();
        if( wordArray[0] -'A' >= 0 && wordArray[0] - 'Z'<=0){
        	upper++;
        	first = true;
        }
        for(int i = 1; i < wordArray.length; i++){
        	if( wordArray[i] -'A' >= 0 && wordArray[i] - 'Z'<=0){
        		upper++;
        	}else{
        		lower++;
        	}
        	if((first == false && upper > 0) || (first == true && upper > 1 && lower > 0))
        		return false;
        }
        return true;
    }
}

/*
class solution{
	public boolean detectCapitalUse(String word){
		if(word.length() < 2) return true;
		if(word.toUpperCase().equals(word)) return true;
		if(word.substring(1).toLowerCase().equals(word.substring(1))) return true;
	}
}

*/