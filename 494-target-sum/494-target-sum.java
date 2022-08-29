class Solution {
    public int helper(int ind, int target, int[] nums, Integer[][] dp){
        if(ind==0){
            if(Math.abs(target)==nums[ind]){
                if(nums[ind]==0) return 2;
                else return 1;
            }
            else return 0;
        }
        int plus=helper(ind-1, target+nums[ind], nums, dp);
        int neg=helper(ind-1, target-nums[ind], nums, dp);
        return plus + neg;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        Integer[][] dp=new Integer[n+1][1000];
        return helper(n-1, target, nums, dp);
    }
}