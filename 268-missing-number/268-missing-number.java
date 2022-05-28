class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int expectedSum=len*(len+1)/2;
        int sum=0;
        for(int num : nums){
            sum+=num;
        }
        return expectedSum-sum;
    }
}