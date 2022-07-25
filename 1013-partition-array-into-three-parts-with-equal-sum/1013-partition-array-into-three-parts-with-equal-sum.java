class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=Arrays.stream(arr).sum(), part=0, average=sum/3, count=0;
        for(int a : arr){
            part+=a;
            if(part==average){
                count++;
                part=0;
            }
        }
        return count>=3 && sum%3==0; 
    }
}