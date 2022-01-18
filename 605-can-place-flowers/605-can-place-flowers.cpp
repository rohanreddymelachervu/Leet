class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.size();i++){
            if(flowerbed[i]==0){
                int prev=(i==0 or flowerbed[i-1]==0) ? 0 : 1;
                int next=(i==flowerbed.size()-1 or flowerbed[i+1]==0) ? 0 : 1;
                if(next==0 and prev==0){
                    flowerbed[i]=1;
                    count++;
                }
            }
        }
        return count>=n;
    }
};