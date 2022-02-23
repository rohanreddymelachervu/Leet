class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        backtrack(result,n,"",0,0);
        return result;
    }
    public void backtrack(List<String> result,int n,String current,int open,int close){
        if((close==n && open==n)){
            result.add(current);
            return;
        }
        if(open<n){
            backtrack(result,n,current+"(",open+1,close);
        }if(close<open){
            backtrack(result,n,current+")",open,close+1);
        }
    }
}