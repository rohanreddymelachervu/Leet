class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        if(sArray.length!=tArray.length) return false;
        for(int i=0;i<tArray.length;i++){
            if(tArray[i]!=sArray[i]) return false;
        }
        return true;
    }
}