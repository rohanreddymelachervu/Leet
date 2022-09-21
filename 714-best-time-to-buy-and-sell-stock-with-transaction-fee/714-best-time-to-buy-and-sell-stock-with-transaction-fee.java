class Solution {
    private int f(int ind, int buy, int[] prices, int fee, Integer[][] dp){
        if(ind>=prices.length) return 0;
        int b=(int)(-1e9), s=(int)(-1e9);
        if(dp[ind][buy]!=null) return dp[ind][buy];
        if(buy==0){
            int buyOnDay = -prices[ind] + f(ind+1, 1, prices, fee, dp) - fee;
            int buyNextDay = f(ind+1, 0, prices, fee, dp);
            b = Math.max(buyOnDay, buyNextDay);
        }else{
            int sellOnDay = prices[ind] + f(ind+1, 0, prices, fee, dp);
            int sellNextDay = f(ind+1, 1, prices, fee, dp);
            s = Math.max(sellOnDay, sellNextDay);
        }
        return dp[ind][buy] = Math.max(b, s);
        
    }
    public int maxProfit(int[] prices, int fee) {
        Integer[][] dp = new Integer[prices.length][2];
        return f(0, 0, prices, fee, dp);
    }
}