class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        findCombinations(result,candidates,target,new ArrayList<>(),0);
        return result;
    }
    public void findCombinations(List<List<Integer>> result,int[] candidates,int target,List<Integer> current,
                                int index){
        if(index==candidates.length){
            if(target==0){
                result.add(new ArrayList<>(current));
            }
            return;
        }
        if(candidates[index]<=target){
            current.add(candidates[index]);
            findCombinations(result,candidates,target-candidates[index],current,index);
            current.remove(current.size()-1);
        }
        findCombinations(result,candidates,target,current,index+1);
    }
}