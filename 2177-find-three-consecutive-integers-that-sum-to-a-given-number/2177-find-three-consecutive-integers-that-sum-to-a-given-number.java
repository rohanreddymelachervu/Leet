class Solution {
    public long[] sumOfThree(long num) {
        long x = num/3;
        if(x + x-1 + x+1 == num){
            return new long[] {x-1, x, x+1};
        }else if(x + x-1 + x+1 < num){
            if(x + x+1 + x+2 == num){
                return new long[] {x, x+1, x+2};
            }
        }else if(x + x-1 + x+1 > num){
              if(x + x-1 + x-2 == num){
                return new long[] {x-2, x-1, x};
            }
        }
        return new long[] {};
    }
}