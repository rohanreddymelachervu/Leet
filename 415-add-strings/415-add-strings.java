class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result=new StringBuilder();
        int carry=0, sum=0, i=num1.length()-1, j=num2.length()-1;
        while(i>=0 || j>=0){
            sum=carry;
            if(i>=0) sum+=num1.charAt(i--)-'0';
            if(j>=0) sum+=num2.charAt(j--)-'0';
            result.append(sum%10);
            carry=sum/10;
        }
        if(carry!=0) result.append(carry);
        return result.reverse().toString();
    }
}