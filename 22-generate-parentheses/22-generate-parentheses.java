class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        findCombinations(result,n,"",0,0,0);
        return result;
    }
    public void findCombinations(List<String> result,int n,String current,int index,int open,int close){
        if(index==n*2){
            result.add(current);
            return;
        }
        if(open<n) findCombinations(result,n,current+"(",index+1,open+1,close); 
        if(close<open) findCombinations(result,n,current+")",index+1,open,close+1);
    }
}