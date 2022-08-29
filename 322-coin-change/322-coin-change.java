class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        Integer[][] dp=new Integer[n][amount+1];
        for(int t=0; t<=amount; t++){
            if(t%coins[0]==0) dp[0][t]=t/coins[0];
            else dp[0][t]=(int)1e9;
        }
        for(int ind=1; ind<n; ind++){
            for(int T=0; T<=amount; T++){
                int nonTake=0+dp[ind-1][T];
                int take=(int)1e9;
                if(coins[ind]<=T){
                    take=1+dp[ind][T-coins[ind]];
                }
                dp[ind][T] = Math.min(nonTake, take); 
            }
        }
        return dp[n-1][amount] == 1e9 ? -1 : dp[n-1][amount];
    }
}