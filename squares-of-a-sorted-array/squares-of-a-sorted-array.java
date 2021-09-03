class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int left=0; int right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(Math.abs(nums[left])>nums[right]){
                result[i]=nums[left]*nums[left];
                left++;
            }
            else{
                result[i]=nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
}