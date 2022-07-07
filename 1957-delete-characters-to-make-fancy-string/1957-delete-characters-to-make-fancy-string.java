class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        String str="";
        if(s.length()<3){
            return s;
        }
        for(int i=0;i<s.length()-2;i++){
            int j=i+1, k=j+1;
            if(!(s.charAt(i)==s.charAt(j) && s.charAt(j)==s.charAt(k)))
                sb.append(s.charAt(i));
        }
        sb.append(s.charAt(s.length()-2));
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
}