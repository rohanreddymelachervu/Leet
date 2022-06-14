class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        generate(result,n,new StringBuilder(),0,0);
        return result;
    }
    private void generate(List<String> result,int n,StringBuilder sb,int open,int close){
        if(open==n && close==n){
            result.add(sb.toString());
            return;
        }
        if(open<n){
            generate(result,n,sb.append("("),open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open>close){
            generate(result,n,sb.append(")"),open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}