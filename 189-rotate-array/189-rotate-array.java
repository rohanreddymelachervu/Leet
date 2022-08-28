class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int left=0, right=nums.length-1;
        while(left<=right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++; right--;
        }
        left=0; right=k-1;
        while(left<=right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++; right--;
        }
        left=k; right=nums.length-1;
        while(left<=right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++; right--;
        }
    }
}