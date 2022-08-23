class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(nums.length == 0 || operations.length == 0) return nums;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<operations.length; i++){
            int index = map.get(operations[i][0]);
            map.remove(operations[i][0]);
            map.put(operations[i][1], index);
        }
        for(int key : map.keySet()){
            nums[map.get(key)] = key;
        }
        return nums;
    }
}