class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max=0;
        for(int n : nums) set.add(n);
        for(int num : nums){
            if(!set.contains(num-1)){
                int curr = num;
                int currentMax = 1;
                while(set.contains(++curr)){
                    currentMax++;
                }
                max=Math.max(max, currentMax);
            }else continue;
        }
        return max;
    }
}