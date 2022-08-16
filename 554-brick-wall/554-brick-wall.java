class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> countGap=new HashMap<>();
        for(List<Integer> r : wall){
            int total=0;
            for(int i=0;i<r.size()-1;i++){
                total+=r.get(i);
                countGap.put(total,countGap.getOrDefault(total,0)+1);
            }
        }
        int max=0;
        for(Map.Entry<Integer,Integer> entry : countGap.entrySet()){
            max = Math.max(max,entry.getValue());
        }
        return wall.size() - max;
    }
}