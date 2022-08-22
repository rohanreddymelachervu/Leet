class Solution {
    public int[] runningSum(int[] nums) {
        int[] cum = new int[nums.length];
        cum[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            cum[i] = nums[i] + cum[i-1];
        }
        return cum;
    }
}