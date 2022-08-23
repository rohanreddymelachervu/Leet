class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        if(trust.length == 0 && n != 1) return -1;
        for(int[] t : trust){
            if(map.containsKey(t[0])){
                List<Integer> temp = map.get(t[0]);
                temp.add(t[1]);
                map.put(t[0], temp);
            }else{
                List<Integer> temp = new ArrayList<>();
                temp.add(t[1]);
                map.put(t[0], temp);
            }
        }
        int judge = -1;
        for(int i=1; i<=n; i++){
            if(!map.containsKey(i)){
                judge = i;
            }
        }
        if(judge == -1) return judge;
        for(int key : map.keySet()){
            if(map.get(key).contains(judge)) continue;
            else return -1;
        }
        return judge;
    }
}