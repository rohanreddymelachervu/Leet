class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        findCombinations(candidates,0,target,new ArrayList<>(),result);
        return result;
    }
    public void findCombinations(int[] candidates,int index,int target,List<Integer> current,
                                List<List<Integer>> result){
        if(index==candidates.length){
            if(target==0) result.add(new ArrayList<Integer>(current));
            return;
        }
        if(candidates[index]<=target){
            current.add(candidates[index]);
            findCombinations(candidates,index,target-candidates[index],current,result);
            current.remove(current.size()-1);
        }
        findCombinations(candidates,index+1,target,current,result);
    }
}