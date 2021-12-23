class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int thisOne=1;
        int nextOne=2;
        int temp=0;
        for(int i=2;i<n;i++){
            temp=thisOne+nextOne;
            thisOne=nextOne;
            nextOne=temp;
        }
        return nextOne;
    }
}