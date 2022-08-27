class Solution {
    public int characterReplacement(String s, int k) {
        int left=0, right=0;
        int[] freq=new int[26];
        int res=0;
        while(right<s.length()){
            freq[s.charAt(right)-'A']++;
            int max=0;
            int windowLen=right-left+1;
            for(int f : freq) max=Math.max(max, f);
            if(windowLen-max <= k){
               res=Math.max(res, windowLen); 
            }else{
                freq[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return res;
    }
}