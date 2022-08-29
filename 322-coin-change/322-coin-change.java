class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[][] dp=new Integer[coins.length+1][amount+1];
        int ans=helper(coins.length, coins, amount, dp);
        return ans == (int)1e9 ? -1 : ans;
    }
    public int helper(int ind, int[] coins, int amount, Integer[][] dp){
        if(ind==0 || amount==0){
            return amount==0 ? 0 : (int)1e9;
        }
        int min1=(int)1e9;
        int min2=(int)1e9;
        if(dp[ind][amount]!=null) return dp[ind][amount];
        if(amount-coins[ind-1]>=0){
            min1=helper(ind, coins, amount-coins[ind-1], dp)+1;
        }
        min2=helper(ind-1, coins, amount, dp);
        return dp[ind][amount] = Math.min(min1, min2);
    }
}