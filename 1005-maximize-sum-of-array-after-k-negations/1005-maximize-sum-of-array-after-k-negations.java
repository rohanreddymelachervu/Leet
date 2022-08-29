class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        while(k>0){
            if(nums[0]==0) break;
            else if(nums[0]>0){
                k=k%2;
                if(k==1){
                    nums[0]=-nums[0];
                    k=0;
                }
            }else{
                nums[0]=-nums[0];
                Arrays.sort(nums);
                k--;
            }
        }
        return Arrays.stream(nums).sum();
    }
}