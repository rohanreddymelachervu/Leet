class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int result=0, max=0;
        for(int key : map.keySet()){
            if(map.containsKey(key+1)){
                result++;
            }else{
                max=Math.max(max, result);
                result=0;
            }
        }
        return ++max;
    }
}