class Solution {
    public int helper(int ind, int prev, int[] nums, Integer[][] dp){
        if(ind==nums.length){
            return 0;
        }
        if(dp[ind][prev+1]!=null) return dp[ind][prev+1];
        int nonTake = helper(ind+1, prev, nums, dp);
        int take = 0;
        if(prev==-1 || nums[ind]>nums[prev]){
            take = 1 + helper(ind+1, ind, nums, dp);
        }
        return dp[ind][prev+1] = Math.max(nonTake, take);
    }
    public int lengthOfLIS(int[] nums) {
        Integer[][] dp=new Integer[nums.length][nums.length+1];
        return helper(0, -1, nums, dp);
    }
}