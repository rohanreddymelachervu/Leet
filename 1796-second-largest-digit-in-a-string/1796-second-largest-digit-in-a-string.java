class Solution {
    public int secondHighest(String s) {
        int max1=-1;
        int max2=-1;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(digit>=0 && digit<=9){
                if(digit==max1 || digit==max2) continue;
                if(digit>max1){
                    max2=max1;
                    max1=digit;
                }else if(digit>max2){
                    max2=digit;
                }
            }
        }
        return max2;
    }
}