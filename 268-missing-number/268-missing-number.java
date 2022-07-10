class Solution {
    public int missingNumber(int[] nums) {
        int sum=(nums.length*(nums.length+1))/2;
        int currSum=0;
        for(int num : nums){
            currSum+=num;
        }
        return sum-currSum;
    }
}