class Solution {
    public int smallestRepunitDivByK(int k) {
        int n=0, i=1;
        if(k%2==0 || k%5==0) return -1;
        while(i<=k){
            n=(n*10+1)%k;
            if(n==0) return i;
            i++;
        }
        return -1;
    }
}