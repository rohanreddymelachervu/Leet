class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s : strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String sortedString=new String(ch);
            if(map.containsKey(sortedString)){
                List<String> curr=map.get(sortedString);
                curr.add(s);
                map.put(sortedString, curr);
            }else{
                List<String> curr=new ArrayList<>();
                curr.add(s);
                map.put(sortedString, curr);
            }
        }
        result.addAll(map.values());
        return result;
    }
}