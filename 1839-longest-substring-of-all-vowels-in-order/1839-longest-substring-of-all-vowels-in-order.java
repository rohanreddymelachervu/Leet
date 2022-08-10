class Solution {
    public int longestBeautifulSubstring(String word) {
        int result=0;
        HashSet<Character> set=new HashSet<>();
        int left=-1, right=0;
        while(right<word.length()){
            if(right>0 && word.charAt(right)<word.charAt(right-1)){
                set.clear();
                left=right-1;
            }
            set.add(word.charAt(right));
            if(set.size()==5){
                result=Math.max(result,right-left);
            }
            right++;
        }
        return result;
    }
}