class Solution {
    public int maxProfit(int[] prices, int fee) {
    	if(prices == null || prices.length == 0) return 0;
        int cash = 0;
        int hold = -prices[0];
        for(int price : prices){
        	cash = Math.max(cash, hold + price - fee);
        	hold = Math.max(hold, cash - price);
        }
        return cash;
    }
}