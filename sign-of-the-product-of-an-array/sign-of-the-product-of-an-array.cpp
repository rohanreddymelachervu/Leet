class Solution {
public:
    int arraySign(vector<int>& nums) {
        int neg_count=0;
        for(auto i : nums){
            if(i==0) return 0;
            if(i<0) neg_count++;
        }
        if(neg_count%2==0) return 1;
        else return -1;
    }
};