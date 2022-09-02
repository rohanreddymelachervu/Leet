class Solution {
    private int f(int ind, int[] nums, Integer[] dp){
        if(ind == 0) return nums[0];
        if(ind < 0) return 0;
        if(dp[ind]!=null) return dp[ind];
        int take = nums[ind] + f(ind-2, nums, dp);
        int nonTake = 0 + f(ind-1, nums, dp);
        return dp[ind] = Math.max(take, nonTake);
    }
    public int rob(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        dp[0]=nums[0];
        for(int ind=1; ind<nums.length; ind++){
            int take=nums[ind];
            if(ind>1)  take += dp[ind-2];
            int nonTake = 0 + dp[ind-1];
            dp[ind] = Math.max(take, nonTake);
        }
        return dp[nums.length-1];
    }
}