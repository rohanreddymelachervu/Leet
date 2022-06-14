class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length==0 || nums==null) return result;
        backtrack(result,nums,new ArrayList<>(),new boolean[nums.length]);
        return result;
    }
    private static void backtrack(List<List<Integer>> result,int[] nums,List<Integer> current,boolean[] visited){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                current.add(nums[i]);
                visited[i]=true;
                backtrack(result,nums,current,visited);
                current.remove(current.size()-1);
                visited[i]=false;
            }
        }
    }
}