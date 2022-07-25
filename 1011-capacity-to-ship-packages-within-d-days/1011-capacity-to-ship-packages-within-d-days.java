class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0, right=0;
        for(int weight : weights){
            left=Math.max(left,weight);
            right+=weight;
        }
        while(left<right){
            int mid=(left+right)/2;
            if(canShip(mid,weights,days)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return right;
    }
    private boolean canShip(int mid,int[] weights,int days){
        int currDays=1, currWeight=0;
        for(int weight : weights){
            currWeight+=weight;
            if(currWeight>mid){
                currWeight=weight;
                currDays++;
            }
        }
        return currDays<=days;
    }
}