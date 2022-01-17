class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits==null || digits.length()==0) return result;
        String[] mapping={
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        letterCombinations(result,digits,"",0,mapping);
        return result;
    }
    public void letterCombinations(List<String> result,String digits,String current,int index,
                                  String[] mapping){
        if(digits.length()==index){
            result.add(current);
            return;
        }
        String letters=mapping[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            letterCombinations(result,digits,current+letters.charAt(i),index+1,mapping);
        }
    }
}