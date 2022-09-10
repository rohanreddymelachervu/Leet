class Solution {
    public int minSwaps(String s) {
        var result=0;
        var close=0;
        for(var c : s.toCharArray()){
            if(c==']'){
                close++;
                result=Math.max(result, close);
            }else if(c=='['){
                close--;
            }
        }
        return (result+1)/2;
    }
}