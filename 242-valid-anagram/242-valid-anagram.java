class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c=s.toCharArray(), ch=t.toCharArray();
        Arrays.sort(c); Arrays.sort(ch);
        if(c.length!=ch.length) return false;
        return Arrays.equals(c,ch);
    }
}