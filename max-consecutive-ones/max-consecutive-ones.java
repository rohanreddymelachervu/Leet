class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE; int max_so_far=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) max_so_far++;
            max=Math.max(max_so_far,max);
            if(nums[i]==0) max_so_far=0;
        }
        return max;
    }
}