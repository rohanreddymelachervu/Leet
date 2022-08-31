class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result=new ArrayList<>();
        int prevStart=intervals[0][0], prevEnd=intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            int currStart=intervals[i][0], currEnd=intervals[i][1];
            if(prevEnd>=currStart){
                prevStart = Math.min(currStart, prevStart);
                prevEnd = Math.max(prevEnd, currEnd);
            }else{
                result.add(new int[] {prevStart, prevEnd});
                prevStart=currStart; 
                prevEnd=currEnd;
            }
        }
        result.add(new int[] {prevStart, prevEnd});
        int[][] res = new int[result.size()][2];
        for(int i=0; i<result.size(); i++){
            res[i]=result.get(i);
        }
        return res;
    }
}