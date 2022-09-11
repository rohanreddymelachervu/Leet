class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3) return 0;
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char curr=s.charAt(i);
            map.put(curr, map.getOrDefault(curr,0)+1);
            if(i>=2){
                if(map.size()==3) count++;
                char prev=s.charAt(i-2);
                if(map.get(prev)==1) map.remove(prev);
                else map.put(prev, map.get(prev)-1);
            }
        }
        return count;
    }
}