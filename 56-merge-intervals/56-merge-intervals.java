class Solution {
    public int[][] merge(int[][] intervals) {
        List<Pair<Integer,Integer>> result=new ArrayList<>();
        if(intervals.length==1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int prevStart=intervals[0][0], prevEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(prevEnd>=intervals[i][0]){
                prevStart=Math.min(prevStart,intervals[i][0]);
                prevEnd=Math.max(prevEnd,intervals[i][1]);
            }else{
                result.add(new Pair<>(prevStart,prevEnd));
                prevStart=intervals[i][0]; prevEnd=intervals[i][1];
            }
        }
        result.add(new Pair<>(prevStart,prevEnd));
        int[][] arr=new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            Pair<Integer,Integer> curr=result.get(i);
            arr[i][0]=curr.getKey();
            arr[i][1]=curr.getValue();
        }
        return arr;
    }
}