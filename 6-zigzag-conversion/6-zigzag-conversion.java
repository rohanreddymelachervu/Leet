class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        List<String> result=new ArrayList<>(Collections.nCopies(numRows,""));
        int r=0; boolean isDiag=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(r==0){
                isDiag=false;
            }else if(r==numRows-1){
                isDiag=true;
            }
            if(!isDiag){
                result.set(r,result.get(r)+ch);
                r++;
            }else if(isDiag){
                result.set(r,result.get(r)+ch);
                r--;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<result.size();i++){
            sb.append(result.get(i));
        }
        return sb.toString();
    }
}