class Solution {
    private boolean isValidMap(String word, String pattern){
        HashMap<Character,Character> map=new HashMap<>();
        if(pattern.length()!=word.length()) return false;
        for(int i=0; i<word.length(); i++){
            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i), pattern.charAt(i));
            }else{
                if(map.get(word.charAt(i))!=pattern.charAt(i)){
                    return false;
                }
            }
        }
        HashMap<Character,Character> map1=new HashMap<>();
        for(int i=0; i<word.length(); i++){
            if(!map1.containsKey(pattern.charAt(i))){
                map1.put(pattern.charAt(i), word.charAt(i));
            }else{
                if(map1.get(pattern.charAt(i))!=word.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result=new ArrayList<>();
        for(String word : words){
            if(isValidMap(word, pattern)){
                result.add(word);
            }
        }
        return result;
    }
}