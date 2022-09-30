class Solution {
    public String reversePrefix(String word, char ch) {
        int index=0;
        StringBuilder sb = new StringBuilder();
        while(index < word.length()){
            if(word.charAt(index) != ch){
                sb.append(word.charAt(index));
            }else{
                sb.append(word.charAt(index));
                sb.reverse();
                sb.append(word.substring(index+1));
                return sb.toString();
            }
            index++;
        }
        return sb.toString();
    }
}