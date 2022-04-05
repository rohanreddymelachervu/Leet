class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result=0;
        for(String s : operations){
            int count=0;
            for(char ch : s.toCharArray()){
                if(ch=='-' && count==0){
                    result--;
                    count++;
                }
                else if(ch=='+' && count==0){
                    result++;
                    count++;
                }
            }
        }
        return result;
    }
}