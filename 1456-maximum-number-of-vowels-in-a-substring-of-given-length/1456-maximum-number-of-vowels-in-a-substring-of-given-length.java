class Solution {
    public int maxVowels(String s, int k) {
        int max=Integer.MIN_VALUE;
        int vowels=0;
        for(int i=0; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                vowels++;
            }
            if(i>=k-1){
                max=Math.max(max, vowels);
                if(isVowel(s.charAt(i-k+1))){
                    vowels--;
                }
            }
        }
        return max;
    }
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}