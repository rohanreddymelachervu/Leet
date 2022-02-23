class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backtrack(result,n,sb,0,0);
        return result;
    }
    public void backtrack(List<String> result,int n,StringBuilder sb,int open,int close){
        if((open==n && close==n)){
            result.add(sb.toString());
            return;
        }
        if(open<n){
            backtrack(result,n,sb.append("("),open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            backtrack(result,n,sb.append(")"),open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}