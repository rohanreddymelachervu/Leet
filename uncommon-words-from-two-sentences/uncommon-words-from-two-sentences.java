class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1=s1.split(" ");
        String[] words2=s2.split(" ");
        HashMap<String,Integer> m1=new HashMap(); HashMap<String,Integer> m2=new HashMap();
        List<String> temp=new ArrayList();
        for(String s : words1) m1.put(s,m1.getOrDefault(s,0)+1);
        for(String s : words2) m2.put(s,m2.getOrDefault(s,0)+1);
        for(String s : words1){
            if(!m2.containsKey(s) && m1.get(s)==1) temp.add(s);
        }
        for(String s : words2){
            if(!m1.containsKey(s) && m2.get(s)==1) temp.add(s);
        }
        String[] result=new String[temp.size()]; int pos=0;
        for(String s : temp){
            result[pos++]=s;
        }
        return result;
    }
}