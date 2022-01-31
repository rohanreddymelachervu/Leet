class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        findPermutations(result,nums,visited,new ArrayList<>());
        return result;
    }
    public void findPermutations(List<List<Integer>> result,int[] nums,boolean[] visited,List<Integer> current){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                current.add(nums[i]);
                findPermutations(result,nums,visited,current);
                visited[i]=false;
                current.remove(current.size()-1);
            }
        }
    }
}