class Solution {
    public void swap(int[] nums, int l, int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public void quicksort(int[] nums, int lo, int hi){
        if(lo>hi) return;
        int pivot=nums[hi];
        int l=lo, r=hi;
        while(l < r){
            while(nums[l]<=pivot && l<r) l++;
            while(nums[r]>=pivot && l<r) r--;
            swap(nums, l, r);
        }
        swap(nums, l, hi);
        quicksort(nums, lo, l-1);
        quicksort(nums, l+1, hi);
    }
    public void sortColors(int[] nums) {
        quicksort(nums, 0, nums.length-1);
    }
}