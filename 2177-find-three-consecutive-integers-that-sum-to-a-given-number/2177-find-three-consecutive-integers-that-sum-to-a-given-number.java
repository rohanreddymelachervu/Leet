class Solution {
    public long[] sumOfThree(long num) {
        long x = num/3;
        if(x + x-1 + x+1 == num) return new long[] {x-1, x, x+1};
        if(x + x-2 + x-1 == num) return new long[] {x-2, x-1, x};
        if(x + x+1 + x+2 == num) return new long[] {x, x+1, x+2};
        return new long[] {};
    }
}