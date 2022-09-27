class Solution {
    private int f(int ind, Integer[] dp){
        if(ind == 0) return 1;
        if(dp[ind] != null) return dp[ind];
        int one = f(ind-1, dp);
        int two = 0;
        if(ind > 1) two = f(ind-2, dp);
        return dp[ind] = one + two;
    }
    public int climbStairs(int n) {
        Integer[] dp = new Integer[n+1];
        return f(n, dp);
    }
}