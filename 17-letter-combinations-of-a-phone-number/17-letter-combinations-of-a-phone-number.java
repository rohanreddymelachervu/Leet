class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        HashMap<Integer,String> map=new HashMap<>();
        if(digits.length()==0) return result;
        map.put(0,"0"); map.put(1,"1"); map.put(2,"abc"); map.put(3,"def"); map.put(4,"ghi");
        map.put(5,"jkl"); map.put(6,"mno"); map.put(7,"pqrs"); map.put(8,"tuv"); map.put(9,"wxyz");
        findCombinations(result,map,digits,"",0);
        return result;
    }
    public void findCombinations(List<String> result,HashMap<Integer,String> map,String digits,String current,
                                int index){
        if(index==digits.length()){
            result.add(current);
            return;
        }
        String letters=map.get(digits.charAt(index)-'0');
        for(int i=0;i<letters.length();i++){
            findCombinations(result,map,digits,current+letters.charAt(i),index+1);
        }
    }
}