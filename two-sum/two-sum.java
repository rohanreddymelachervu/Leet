class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap();
        int[] arr=new int[2]; int pos=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                arr[pos++]=hm.get(target-nums[i]);
                arr[pos++]=i;
                return arr;
            }
            else hm.put(nums[i],i);
        }
        return arr;
    }
}