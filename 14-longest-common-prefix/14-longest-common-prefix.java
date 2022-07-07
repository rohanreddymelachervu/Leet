class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        StringBuilder sb=new StringBuilder();
        int counter=0;
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i<strs[j].length() && ch==strs[j].charAt(i)){
                    counter++;
                }else{
                    counter=0;
                    return sb.toString();
                    
                }
            }
            if(counter==strs.length-1){
                counter=0;
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}