class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        Integer[][] dp=new Integer[n][amount+1];
        int ans=helper(n-1, coins, amount, dp);
        return ans == (int)1e9 ? -1 : ans;
    }
    public int helper(int ind, int[] coins, int T, Integer[][] dp){
        if(ind==0){
            if(T%coins[ind]==0){
                return T/coins[ind];
            }else return (int)1e9;
        }
        if(dp[ind][T]!=null) return dp[ind][T];
        int nonTake=0+helper(ind-1, coins, T, dp);
        int take=(int)1e9;
        if(coins[ind]<=T){
            take=1+helper(ind, coins, T-coins[ind], dp);
        }
        return dp[ind][T] = Math.min(nonTake, take);
    }
}