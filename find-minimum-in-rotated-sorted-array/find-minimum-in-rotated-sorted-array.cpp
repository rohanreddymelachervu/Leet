class Solution {
public:
    int findMin(vector<int>& nums) {
        int l=0; int r=nums.size()-1; int last=nums[r];
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]>last) l=mid+1;
            else r=mid;
        }
        return nums[l];
    }
};