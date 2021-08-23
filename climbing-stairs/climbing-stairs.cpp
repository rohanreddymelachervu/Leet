class Solution {
public:
    int dp[50]={};
    int climbStairs(int n) {
        if(n==1) return 1;
        else if(n==2) return 2;
        else
        {
            int one,two;
            if(dp[n-2]!=0) one =dp[n-2];
            else{ 
                one =climbStairs(n-1);
                dp[n-2]=one;
            }
            if(dp[n-3]!=0) two =dp[n-3];
            else{
                two=climbStairs(n-2);
                dp[n-3]=two; 
                }
            dp[n-1]=one + two;
            return dp[n-1];
        }
    }
};