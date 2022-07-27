class Solution {
    public String longestPalindrome(String s) {
        String result="";
        int resLen=0;
        for(int i=0;i<s.length();i++){
            // odd length
            int l=i, r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1>resLen){
                    result=s.substring(l,r+1);
                    resLen=r-l+1;
                }
                l--;
                r++;
            }
            //even length
            l=i; r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1>resLen){
                    result=s.substring(l,r+1);
                    resLen=r-l+1;
                }
                l--;
                r++;
            }
        }
        return result;
    }
}