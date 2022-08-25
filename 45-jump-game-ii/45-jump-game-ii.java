class Solution {
    Integer[] cache;
    public int jump(int[] nums) {
        cache=new Integer[nums.length+1];
        return helper(nums, 0);
    }
    public int helper(int[] nums, int index){
        if(index>=nums.length-1){
            return 0;
        }
        if(cache[index]!=null){
            return cache[index];
        }
        int minJumps=10000;
        for(int i=index+1; i<=index+nums[index]; i++){
            minJumps=Math.min(minJumps, 1+helper(nums, i));
            cache[index]=minJumps;
        }
        return minJumps;
    }
}