class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0) return result;
        String[] mapping={"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(result,digits,mapping,new StringBuilder(),0);
        return result;
    }
    private void backtrack(List<String> result,String digits,String[] mapping,StringBuilder sb,int index){
        if(sb.length()==digits.length()){
            result.add(new String(sb));
            return;
        }
        String letters=mapping[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            sb.append(letters.charAt(i));
            backtrack(result,digits,mapping,sb,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}