class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<=s.length()/2;i++){
            String substring=s.substring(0,i);
            StringBuilder sb=new StringBuilder();
            int numRepeats=s.length()/i;
            for(int j=0;j<numRepeats;j++){
                sb.append(substring);
            }
            if(sb.toString().equals(s)) return true;
        }
        return false;
    }
}