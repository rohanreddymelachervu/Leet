class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0, right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target) return findIndices(mid,target,nums);
            else if(nums[mid]>target){
                right=mid-1;
            }
            else left=mid+1;
        }
        return new int[] {-1,-1};
    }
    private int[] findIndices(int index, int target, int[] nums){
        int high=index, low=index;
        while(high<nums.length && nums[high]==target) high++;
        while(low>=0 && nums[low]==target) low--;
        return new int[] {low+1,high-1};
    }
}