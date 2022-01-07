class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(words[i]);
            words[i]=sb.reverse().toString();
        }
        StringBuilder result=new StringBuilder();
        for(String sg : words) result.append(sg+" ");
        return result.toString().strip();
    }
}