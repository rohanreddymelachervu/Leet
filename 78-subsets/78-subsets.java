class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,nums,new ArrayList<>(),0);
        return result;
    }
    private void backtrack(List<List<Integer>> result,int[] nums,List<Integer> current,int index){
        if(index==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        // include nums[i]
        current.add(nums[index]);
        backtrack(result,nums,current,index+1);
        current.remove(current.size()-1);
        backtrack(result,nums,current,index+1);
    }
}