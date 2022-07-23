class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        Arrays.fill(visited,false);
        backtrack(result,new HashSet<>(),new ArrayList<>(),nums,visited);
        return result;
    }
    private void backtrack(List<List<Integer>> result,HashSet<List<Integer>> set,List<Integer> current,int[] nums,boolean[] visited){
        if(current.size()==nums.length){
            if(!set.contains(current)){
                set.add(current);
                result.add(new ArrayList<>(current));
                return;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                current.add(nums[i]);
                visited[i]=true;
                backtrack(result,set,current,nums,visited);
                current.remove(current.size()-1);
                visited[i]=false;
            }
        }
    }
}