class Solution {
    public int longestBeautifulSubstring(String word) {
        HashSet<Character> set=new HashSet<>();
        int left=0, right=0, max=0;
        while(right<word.length()){
            if(right==0 || right>0 && word.charAt(right)>=word.charAt(right-1)){
                set.add(word.charAt(right));
            }else{
                if(set.size()==5){
                    max=Math.max(max, right-left);
                }
                set.clear();
                left=right;
                set.add(word.charAt(right));
            }
            right++;
        }
        if(set.size()==5) max=Math.max(max, word.length() - left);
        return max;
    }
}