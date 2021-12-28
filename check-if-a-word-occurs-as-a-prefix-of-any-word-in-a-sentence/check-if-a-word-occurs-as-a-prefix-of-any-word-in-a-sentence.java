class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] sentArray=sentence.split(" ");
        for(int i=0;i<sentArray.length;i++){
            if(sentArray[i].startsWith(searchWord)) return i+1;
        }
        return -1;
    }
}