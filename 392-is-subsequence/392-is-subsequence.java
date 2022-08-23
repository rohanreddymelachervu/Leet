class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = s.length()-1, right = t.length()-1;
        if(s.length() == 1 && t.length() == 1) return t.charAt(0) == s.charAt(0);
        while(left>=0 && right>=0){
            if(t.charAt(right) == s.charAt(left)){
                right--;
                left--;
            }else{
                right--;
            }
        }
        return left < 0;
    }
}