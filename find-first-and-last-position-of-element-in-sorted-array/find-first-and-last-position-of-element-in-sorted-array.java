class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0, right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target) return findIndices(nums,mid,target);
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return new int[] {-1,-1};
    }
    public int[] findIndices(int[] nums,int index,int target){
        int[] result=new int[2];
        int high=index, low=index;
        while(high<=nums.length-1 && nums[high]==target) ++high;
        while(low>=0 && nums[low]==target) --low;
        result[0]=low+1; result[1]=high-1;
        return result;
    }
}