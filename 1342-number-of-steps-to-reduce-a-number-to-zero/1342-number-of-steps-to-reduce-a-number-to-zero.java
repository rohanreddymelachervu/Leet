class Solution {
    private int even(int num){
        num=num/2;
        return num;
    }
    private int odd(int num){
        num-=1;
        return num;
    }
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0){
                num=even(num);
                count++;
            }else{
                num=odd(num);
                count++;
            }
        }
        return count;
    }
}