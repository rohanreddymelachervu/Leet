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
        findCombinations(result,digits,mapping,"",0);
        return result;
    }
    public void findCombinations(List<String> result,String digits,String[] mapping,String current,int index){
        if(index==digits.length()){
            result.add(current);
            return;
        }
        String letters=mapping[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            findCombinations(result,digits,mapping,current+letters.charAt(i),index+1);
        }
    }
}