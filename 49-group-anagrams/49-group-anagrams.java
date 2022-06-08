class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> result=new ArrayList<>();
        for(String s : strs){
            char[] charArr=s.toCharArray();
            Arrays.sort(charArr);
            String finalStr=new String(charArr);
            if(!map.containsKey(finalStr)) map.put(finalStr,new ArrayList<String>());
            map.get(finalStr).add(s);
        }
        result.addAll(map.values());
        return result;
    }
}