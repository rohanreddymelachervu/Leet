class Solution {
    public String reformat(String s) {
        int digits=0, letters=0;
        List<Character> d=new ArrayList<>();
        List<Character> l=new ArrayList<>();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                letters++;
                l.add(c);
            }
            if(Character.isDigit(c)){
                digits++;
                d.add(c);
            }
        }
        if(Math.abs(letters-digits)>1) return "";
        StringBuilder sb=new StringBuilder();
        if(d.size()>l.size()){
            int i=0;
            for(;i<l.size();i++){
                sb.append(d.get(i));
                sb.append(l.get(i));
            }
            for(;i<d.size();i++){
                sb.append(d.get(i));
            }
        }else{
            int i=0;
            for(;i<d.size();i++){
                sb.append(l.get(i));
                sb.append(d.get(i));
            }
            for(;i<l.size();i++){
                sb.append(l.get(i));
            }
        }
        return sb.toString();
    }
}