class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] result=new int[k];
        Arrays.fill(result,0);
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int[] l : logs){
            if(map.containsKey(l[0])){
                HashSet set=map.get(l[0]);
                set.add(l[1]);
                map.put(l[0],set);
            }else{
                HashSet<Integer> set=new HashSet<>();
                set.add(l[1]);
                map.put(l[0],set);
            }
        }
        HashMap<Integer,Integer> mapping=new HashMap<>();
        for(int key : map.keySet()){
            HashSet set=map.get(key);
            int size=set.size();
            mapping.put(size, mapping.getOrDefault(size,0)+1);
        }
        for(int key : mapping.keySet()){
            result[key-1]=mapping.get(key);
        }
        return result;
    }
}