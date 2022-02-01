class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        s=s.replaceAll("\\p{Punct}","");
        s=s.toLowerCase();
        s=s.replaceAll("\\s","");
        int start=0, end=s.length()-1;
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }
}