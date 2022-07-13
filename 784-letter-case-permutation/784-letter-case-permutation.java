class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backtrack(result,sb,0,s);
        return result;
    }
    private void backtrack(List<String> result,StringBuilder sb,int index,String s){
        if(index==s.length()){
            result.add(sb.toString());
            return;
        }
        char c=s.charAt(index);
        if(Character.isDigit(c)){
            sb.append(c);
            backtrack(result,sb,index+1,s);
        }else{
            sb.append(Character.toLowerCase(c));
            backtrack(result,new StringBuilder(sb),index+1,s);
            sb.deleteCharAt(sb.length()-1);
            sb.append(Character.toUpperCase(c));
            backtrack(result,new StringBuilder(sb),index+1,s);
        }
    }
}