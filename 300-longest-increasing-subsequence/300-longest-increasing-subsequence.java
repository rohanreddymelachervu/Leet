class Solution {
    private int f(int ind, int prev, int n, int[] nums, Integer[][] dp){
        if(ind==n) return 0;
        int notTake = (int)(-1e9), take = (int)(-1e9);
        if(dp[ind][prev+1]!=null) return dp[ind][prev+1];
        notTake = 0 + f(ind+1, prev, n, nums, dp);
        if(prev==-1 || nums[ind] > nums[prev]){
            take = 1 + f(ind+1, ind, n, nums, dp);
        }
        return dp[ind][prev+1] = Math.max(take, notTake);
    }
    public int lengthOfLIS(int[] nums) {
        Integer[][] dp = new Integer[nums.length+1][nums.length+1];
        return f(0, -1, nums.length, nums, dp);    
    }
}