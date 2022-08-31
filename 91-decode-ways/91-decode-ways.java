class Solution {
    public int f(int ind, String s, Integer[] dp){
        if(ind==s.length()) return 1;
        if(s.charAt(ind)-'0'==0) return 0;
        if(dp[ind]!=null) return dp[ind];
        int oneStep = 0, twoStep=0;
        if(s.charAt(ind)-'0'>=1 && s.charAt(ind)-'0'<=9){
            oneStep = f(ind+1, s, dp);
        }
        if(ind+1<s.length()){
            if(((s.charAt(ind)-'0')*10 + s.charAt(ind+1)-'0')<=26){
                twoStep = f(ind+2, s, dp);
            }
        }
        return dp[ind] = oneStep + twoStep;
    }
    public int numDecodings(String s) {
        Integer[] dp = new Integer[s.length()+1];
        return f(0, s, dp);
    }
}