class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=s.length()/2;i>=1;i--){
            int num_repeats=s.length()/i;
            String substring=s.substring(0,i);
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<num_repeats;j++){
                sb.append(substring);
            }
            if(sb.toString().equals(s)) return true;              
        }
        return false;
    }
}