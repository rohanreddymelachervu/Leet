class Solution {
    public int findNumericValue(String s){
        StringBuilder value=new StringBuilder();
        for(char ch : s.toCharArray()){
            value.append(ch-'0'-49);
        }
        return Integer.parseInt(value.toString());
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstWordValue=findNumericValue(firstWord);
        int secondWordValue=findNumericValue(secondWord);
        int thirdWordValue=findNumericValue(targetWord);
        return (firstWordValue+secondWordValue==thirdWordValue);
    }
}