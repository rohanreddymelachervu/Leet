class Solution {
    Integer[] cache;
    public int helper(int ind, int[] nums, Integer[] cache){
        if(ind==0) return nums[0];
        if(ind<0) return 0;
        if(cache[ind]!=null) return cache[ind];
        int take=nums[ind] + helper(ind-2, nums, cache);
        int nonTake = helper(ind-1, nums, cache);
        return cache[ind] = Math.max(take, nonTake);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        cache=new Integer[n+1];
        return helper(n-1, nums, cache);
    }
}