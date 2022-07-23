class Solution {
    public int characterReplacement(String s, int k) {
        int left=0, right=0, max=0;
        int[] map=new int[26];
        while(right<s.length()){
            map[s.charAt(right)-'A']++;
            int maxFreq=0;
            for(int num : map){
                maxFreq=Math.max(maxFreq,num);
            }
            int windowLen=right-left+1;
            if(windowLen-maxFreq<=k){
                max=Math.max(max,windowLen);
                right++;
            }
            else{
                map[s.charAt(left)-'A']--;
                map[s.charAt(right)-'A']--;
                left++;
            }
        }
        return max;
    }
}