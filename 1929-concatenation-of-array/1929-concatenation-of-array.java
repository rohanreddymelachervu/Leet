class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] result = new int[n*2];
        for(int i=0; i<2*n; i++){
            if(i<n){
                result[i] = nums[i];
            }
            else{
                int mod = i % n;
                result[n + mod] = nums[mod];
            }
        }
        return result;
    }
}