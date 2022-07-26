class Solution {
    public int maxPower(String s) {
        int count=1, max=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i-1);
            char c=s.charAt(i);
            if(ch==c) count++;
            else{
                max=Math.max(max,count);
                count=1;
            }
        }
        return Math.max(count,max);
    }
}