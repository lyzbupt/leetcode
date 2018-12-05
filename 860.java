class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int bill : bills){
        	if(bill == 5){
        		five++; 
        	}else if(bill == 10 && five > 0){
        		five--;
        		ten++;
        	}else if(bill == 20 && ((ten > 0 && five > 0) ||
        		(five > 2))){
        		if((ten > 0 && five > 0)){
        			ten--;
        			five--;
        		}else{
        			five -= 3;
        		}
        	}else{
        		return false;
        	}
        }
        return true;
    }
}