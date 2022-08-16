class Solution {
    public int firstUniqChar(String s) {
        int[] map=new int[26];
        for(char c : s.toCharArray()){
            map[c-'a']++;
        }
        int pos=0;
        for(char c : s.toCharArray()){
            if(map[c-'a']==1) return pos;
            pos++;
        }
        return -1;
    }
}