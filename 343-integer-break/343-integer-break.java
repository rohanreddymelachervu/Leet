class Solution {
    Integer[] cache;
    public int helper(int n, Integer[] cache){
        if(n==1) return 1;
        if(cache[n]!=null) return cache[n];
        int max=0;
        for(int i=1; i<n; i++){
            max=Math.max(i*helper(n-i, cache),Math.max(max, i*(n-i)));
        }
        return cache[n] = max;
    }
    public int integerBreak(int n) {
        cache=new Integer[n+1];
        return helper(n, cache);
    }
}