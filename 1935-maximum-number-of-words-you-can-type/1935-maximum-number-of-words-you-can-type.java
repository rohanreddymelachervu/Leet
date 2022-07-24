class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int[] map=new int[26];
        int count=0;
        for(char c : brokenLetters.toCharArray()){
            map[c-'a']++;
        }
        for(String word : words){
            boolean flag=true;
            for(char c : word.toCharArray()){
                if(map[c-'a']>0){
                    flag=false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}