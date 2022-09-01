class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result=new ArrayList<>();
        for(int[] arr : intervals){
            if(arr[1] < newInterval[0]) result.add(arr);
            else if(newInterval[1] < arr[0]){
                result.add(newInterval);
                newInterval = arr;
            }else{
                newInterval[0] = Math.min(arr[0], newInterval[0]);
                newInterval[1] = Math.max(arr[1], newInterval[1]);
            }
        }
        result.add(newInterval);
        int[][] res=new int[result.size()][2];
        for(int i=0; i<res.length; i++){
            res[i]=result.get(i);
        }
        return res;
    }
}