class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int curr=prices[0], profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<curr) curr=prices[i];
            else{
                profit+=prices[i]-curr;
                curr=prices[i];
            }
        }
        return profit;
    }
}