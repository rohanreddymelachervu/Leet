class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result,nums,new ArrayList<>(),0);
        return result;
    }
    private static void backtrack(List<List<Integer>> result,int[] nums,List<Integer> current,int index){
        if(index==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        // Include nums[index]
        current.add(nums[index]);
        backtrack(result,nums,current,index+1);
        current.remove(current.size()-1);
        //Don't include nums[index]
        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        backtrack(result,nums,current,index+1);
    }
}