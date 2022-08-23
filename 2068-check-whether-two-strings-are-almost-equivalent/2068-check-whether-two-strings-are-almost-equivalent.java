class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        HashSet<Character> set = new HashSet<>();
        for(char c : word1.toCharArray()){
            set.add(c);
            map1[c-'a']++;
        }
        for(char c : word2.toCharArray()){
            set.add(c);
            map2[c-'a']++;
        }
        for(char c : set){
            if(Math.abs(map1[c-'a'] - map2[c-'a']) > 3){
                return false;
            }
        }
        return true;
    }
}