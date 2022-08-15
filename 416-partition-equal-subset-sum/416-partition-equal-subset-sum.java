class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num : nums) sum+=num;
        if(sum%2==1) return false;
        HashSet<Integer> dp=new HashSet<>();
        dp.add(0);
        int target=sum/2;
        for(int i=nums.length-1;i>=0;i--){
            HashSet<Integer> nextDp = new HashSet<>(dp);
            for(int t : dp){
                nextDp.add(nums[i] + t);
            }
            dp=nextDp;
        }
        return dp.contains(target);
    }
}