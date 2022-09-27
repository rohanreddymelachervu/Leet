class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i-1] == nums[i]){
                continue;
            }
            int lo = i+1, hi = nums.length-1;
            while(lo < hi){
                if(nums[i] + nums[lo] + nums[hi] == 0){
                    result.add(Arrays.asList(nums[lo], nums[i], nums[hi]));
                    while(lo < hi && nums[lo] == nums[lo+1]) lo++;
                    while(lo < hi && nums[hi] == nums[hi-1]) hi--;
                    hi--;
                    lo++;
                }else if(nums[i] + nums[lo] + nums[hi] > 0){
                    hi--;
                }else{
                    lo++;
                }
            }
        }
        return result;
    }
}