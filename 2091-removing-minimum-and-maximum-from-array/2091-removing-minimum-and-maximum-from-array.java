class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int maxIndex=0, minIndex=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == max) maxIndex=i;
            if(nums[i] == min) minIndex=i;
        }
        int result=Integer.MAX_VALUE;
        result = Math.min(result, Math.max(maxIndex, minIndex) + 1);
        result = Math.min(result, nums.length - Math.min(maxIndex, minIndex));
        result = Math.min(result, Math.min(maxIndex, minIndex) + 1 + nums.length -Math.max(maxIndex, minIndex));
        return result;
    }
}