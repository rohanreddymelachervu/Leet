class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[][] dp=new Integer[coins.length][amount+1];
        for(int i=0; i<=amount; i++){
            if(i%coins[0]==0) dp[0][i]=i/coins[0];
            else dp[0][i]=(int)1e9;
        }
        for(int ind=1; ind<coins.length; ind++){
            for(int T=0; T<=amount; T++){
                int nonTake = dp[ind-1][T];
                int take = (int)1e9;
                if(coins[ind]<=T){
                    take = 1 + dp[ind][T-coins[ind]];
                }
                dp[ind][T] = Math.min(take, nonTake);
            }
        }
        return dp[coins.length-1][amount] == (int)1e9 ? -1 : dp[coins.length-1][amount];
    }

}