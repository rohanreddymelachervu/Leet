class Solution {
    private boolean isSelfDividing(int num){
        if(num<10) return true;
        if(num%10==0) return false;
        int tmp=num;
        while(tmp>=10){
            if(tmp%10==0) return false;
            int divide=tmp%10;
            tmp/=10;
            if(num%divide!=0){
                return false;
            }
        }
        if(num%tmp!=0) return false;
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)){
                result.add(i);
            }
        }
        return result;
    }
}