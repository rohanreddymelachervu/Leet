class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int result=0;
        for(int key : map.keySet()){
            if(k>0 && map.containsKey(key + k) || k == 0 && map.get(key)>1){
                result++;
            }
        }
        return result;
    }
}