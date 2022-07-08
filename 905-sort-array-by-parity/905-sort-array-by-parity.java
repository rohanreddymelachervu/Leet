class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) return nums;
        int l=0, r=nums.length-1;
        while(l<r){
            if(nums[l]%2!=0 && nums[r]%2==0){
                int eve=nums[r];
                nums[r]=nums[l];
                nums[l]=eve;
                l++; r--;
            }else if(nums[l]%2!=0){
                r--;
            }else if(nums[l]%2==0){
                l++;
            }
        }
        return nums;
    }
}