class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<strs[0].length(); i++){
            char ch=strs[0].charAt(i);
            int counter=0;
            for(int j=1; j<strs.length; j++){
                if(i<strs[j].length() && ch==strs[j].charAt(i)){
                    counter++;
                }else{
                    return sb.toString();
                }
            }
            if(counter==strs.length-1){
                sb.append(ch);
                counter=0;
            }
        }
        return sb.toString();
    }
}