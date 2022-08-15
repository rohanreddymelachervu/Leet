class Solution {
    public int romanToInt(String s) {
        int[] map=new int[26];
        map['I'-'A']=1; map['V'-'A']=5; map['X'-'A']=10;
        map['L'-'A']=50; map['C'-'A']=100; map['D'-'A']=500; map['M'-'A']=1000;
        int result=0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && map[s.charAt(i)-'A']<map[s.charAt(i+1)-'A']){
                result-=map[s.charAt(i)-'A'];
            }else{
                result+=map[s.charAt(i)-'A'];
            }
        }
        return result;
        
    }
}