class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=0, r=1000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            long sum=getSum(nums,mid);
            if(sum>threshold) l=mid+1;
            else r=mid-1;
        }
        return l;
    }
    private long getSum(int[] nums,int d){
        long sum=0;
        for(int num : nums){
            sum+=Math.ceil((double)num/d);
        }
        return sum;
    }
}