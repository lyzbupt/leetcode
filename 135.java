class Solution {
    public int candy(int[] ratings) {
        int[] candyNums = new int[ratings.length];
        int res = 0;
        Arrays.fill(candyNums, 1);
        for(int i = 1; i < ratings.length; i++){
        	if(ratings[i] > ratings[i-1]){
        		candyNums[i] = candyNums[i-1] + 1;
        	}
        }
        for(int i = ratings.length - 2; i >=0; i--){
        	if(ratings[i] > ratings[i+1]){
        		candyNums[i] = Math.max(candyNums[i], candyNums[i+1]+1);
        	}
        	res += candyNums[i];
        }
        res += candyNums[ratings.length - 1];
        return res;
    }
}