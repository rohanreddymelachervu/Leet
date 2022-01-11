class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        finalCombinations(0,candidates,target,new ArrayList<Integer>(),result);
        return result;
    }
    public void finalCombinations(int index,int[] candidates,int target,List<Integer> current,
                                 List<List<Integer>> result){
        if(index==candidates.length){
            if(target==0){
                result.add(new ArrayList<Integer>(current));
            }
            return;
        }
        if(candidates[index]<=target){
            current.add(candidates[index]);
            finalCombinations(index,candidates,target-candidates[index],current,result);
            current.remove(current.size()-1);
        }
        finalCombinations(index+1,candidates,target,current,result);
    }
}