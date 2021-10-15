class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxx=0, min=INT_MAX;
        for(int i=0;i<prices.size();i++){
            if(prices[i]<min) min=prices[i];
            else{
                maxx=max(maxx,prices[i]-min);   
            }
        }
        return maxx;
    }
};