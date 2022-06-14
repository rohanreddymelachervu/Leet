class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        if(candidates==null || candidates.length==0) return result;
        backtrack(result,candidates,target,new ArrayList<>(),0);
        return result;
    }
    private void backtrack(List<List<Integer>> result,int[] candidates,int target,List<Integer> current,int index){
        if(index==candidates.length){
            if(target==0) result.add(new ArrayList<>(current));
            return;
        }
        if(candidates[index]<=target){
            current.add(candidates[index]);
            backtrack(result,candidates,target-candidates[index],current,index);
            current.remove(current.size()-1);
        }
        backtrack(result,candidates,target,current,index+1);
    }
}