class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int sum=accumulate(nums.begin(),nums.end(),0);
        if(sum-nums[0]==0) return 0;
        int left=0,right=0;
        for(int i=1;i<nums.size();i++){
            left+=nums[i-1];
            right=sum-nums[i]-left;
            if(left==right) return i;
        }
        return -1;
    }
};