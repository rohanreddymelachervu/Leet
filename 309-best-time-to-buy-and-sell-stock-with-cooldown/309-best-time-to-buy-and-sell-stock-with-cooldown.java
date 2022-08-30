class Solution {
    public int helper(int ind, int buy, int[] prices, int n, Integer[][] dp){
        if(ind>=n) return 0;
        if(dp[ind][buy] != null) return dp[ind][buy];
        if(buy==0){
            int buyOnDay = -prices[ind] + helper(ind+1, 1, prices, n, dp);
            int buyNextDay = helper(ind+1, 0, prices, n, dp);
            return dp[ind][buy] = Math.max(buyOnDay, buyNextDay);
        }else{
            int sellOnDay = prices[ind] + helper(ind+2, 0, prices, n, dp);
            int sellNextDay = helper(ind+1, 1, prices, n, dp);
            return dp[ind][buy] = Math.max(sellOnDay, sellNextDay);
        }
    }
    public int maxProfit(int[] prices) {
        int buy=0;
        Integer[][] dp=new Integer[prices.length][2];
        return helper(0, buy, prices, prices.length, dp);
    }
}