class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] <= nums[i-1]){
                if(count>1){
                    return false;
                }
                if(i>1 && nums[i]<=nums[i-2]){
                    nums[i]=nums[i-1];
                }
                count++;
            }
        }
        return count>1 ? false : true;
    }
}