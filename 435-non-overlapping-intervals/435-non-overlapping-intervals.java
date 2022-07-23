class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0) return 0;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int result=0, prevEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=prevEnd){
                prevEnd=intervals[i][1];
            }else{
                result+=1;
                prevEnd=Math.min(intervals[i][1],prevEnd);
            }
        }
        return result;
    }
}