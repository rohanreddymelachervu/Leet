class Solution {
    public int jump(int[] nums) {
        int jumps=0, currentEnd=0, nextEnd=0;
        for(int i=0;i<nums.length-1;i++){
            nextEnd=Math.max(nextEnd, nums[i]+i);
            if(i==currentEnd){
                jumps++;
                currentEnd=nextEnd;
            }
        }
        return jumps;
    }
}