class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result=new ArrayList<>();
        if(candidates==null || candidates.length==0) return result;
        Arrays.sort(candidates);
        backtrack(candidates,0,new ArrayList<>(),target);
        return result;
    }
    private void backtrack(int[] candidates,int index,List<Integer> current,int target){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0){
            return;
        }
        if(index>=candidates.length){
            return;
        }
        current.add(candidates[index]);
        backtrack(candidates,index+1,current,target-candidates[index]);
        current.remove(current.size()-1);
        while(index+1<candidates.length && candidates[index]==candidates[index+1]){
            index++;
        }
        backtrack(candidates,index+1,current,target);
    }
}