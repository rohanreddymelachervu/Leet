class Solution {
    public int maxProduct(int[] nums) {
        int currMax=1, currMin=1, res=Integer.MIN_VALUE;
        for(int num : nums) res=Math.max(res,num);
        for(int n : nums){
            int temp=currMax * n;
            currMax=Math.max(n,Math.max(temp,currMin*n));
            currMin=Math.min(n,Math.min(temp,currMin*n));
            res=Math.max(res,currMax);
        }
        return res;
    }
}