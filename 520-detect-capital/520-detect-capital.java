class Solution {
    public boolean detectCapitalUse(String word) {
        int capitals=0;
        for(char ch : word.toCharArray())
            if(Character.isUpperCase(ch)) capitals++;
        return ((capitals==word.length()) || (capitals==1 && Character.isUpperCase(word.charAt(0))) || capitals==0); 

    }
}