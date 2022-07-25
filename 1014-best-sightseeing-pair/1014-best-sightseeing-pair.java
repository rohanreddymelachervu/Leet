class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=values[0]+0;
        int ans=-1;
        int n=values.length;
        for(int i=1;i<n;i++){
            ans=Math.max(ans,max+values[i]-i);
            max=Math.max(max,values[i]+i);
        }
        return ans;
    }
}