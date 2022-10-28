class Solution {
    private int f(int ind, int[] nums, Integer[] dp){
        if(ind == 0){
            return nums[ind];
        }if(ind < 0){
            return 0;
        }
        if(dp[ind]!=null){
            return dp[ind];
        }
        int take = nums[ind] + f(ind-2, nums, dp);
        int notTake = f(ind-1, nums, dp);
        return dp[ind] = Math.max(take, notTake);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        Integer[] dp = new Integer[nums.length+1];
        return f(n-1, nums, dp);
    }
}