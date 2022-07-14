class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long sum=0;
        for(int i=0;i<beans.length;i++){
            sum+=beans[i];
        }
        long ans=Long.MAX_VALUE;
        for(int i=0;i<beans.length;i++){
            long res=sum-(beans[i]*(beans.length - i + 0L));
            ans = (long)Math.min(ans,res);
        }
        return ans;
    }
}