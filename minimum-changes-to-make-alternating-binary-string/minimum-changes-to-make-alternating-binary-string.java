class Solution {
    public int minOperations(String s) {
        int start1=0,start2=0;
        int left=0,right=1;
        while(right<s.length()){
            if(s.charAt(left)=='0' && s.charAt(right)=='1'){
                left+=2; right+=2;
            } else if(s.charAt(left)=='0' && s.charAt(right)=='0'){
                start1++; left+=2; right+=2;
            } else if(s.charAt(left)=='1' && s.charAt(right)=='1'){
                start1++; left+=2; right+=2;
            } else{
                start1+=2; left+=2; right+=2;
            }
        }
        left=0; right=1;
        while(right<s.length()){
            if(s.charAt(left)=='1' && s.charAt(right)=='0'){
                left+=2; right+=2;
            } else if(s.charAt(left)=='1' && s.charAt(right)=='1'){
                start2++; left+=2; right+=2;
            } else if(s.charAt(left)=='0' && s.charAt(right)=='0'){
                start2++; left+=2; right+=2;
            } else{
                start2+=2; left+=2; right+=2;
            }
        }
        if(start1==start2) return start1;
        if(s.length()%2!=0){
            if(start1<start2){
                if(s.charAt(s.length()-1)=='1') return ++start1;
                else return start1;
            } else{
                if(s.charAt(s.length()-1)=='0') return ++start2;
                else return start2;
            }
        }
        return Math.min(start1,start2);
    }
}