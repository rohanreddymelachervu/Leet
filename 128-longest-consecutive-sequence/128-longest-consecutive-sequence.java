class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums) set.add(num);
        int max=0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentMax=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentMax++;
                }
                max=Math.max(max, currentMax);
            }else{
                continue;
            }
        }
        return max;
    }
}