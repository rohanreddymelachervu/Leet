class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[][] dp=new Integer[coins.length][amount+1];
        int minCoins = helper(coins.length-1, amount, coins, dp);
        return minCoins == (int)1e9 ? -1 : minCoins;
    }
    public int helper(int ind, int T, int[] coins, Integer[][] dp){
        if(ind==0){
            if(T%coins[ind]==0) return T/coins[ind];
            else return (int)1e9;
        }
        if(dp[ind][T]!=null) return dp[ind][T];
        int nonTake = helper(ind-1, T, coins, dp);
        int take = (int)1e9;
        if(coins[ind]<=T){
            take = 1 + helper(ind, T-coins[ind], coins, dp);
        }
        return dp[ind][T] = Math.min(take, nonTake);
    }
}