class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), new boolean[nums.length], nums);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> current, boolean[] visited, int[] nums){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!visited[i]){
                current.add(nums[i]);
                visited[i]=true;
                backtrack(result, current, visited, nums);
                visited[i]=false;
                current.remove(current.size()-1);
            }
        }
    }
}