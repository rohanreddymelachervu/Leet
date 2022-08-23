class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = s.length()-1, right = t.length()-1;
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