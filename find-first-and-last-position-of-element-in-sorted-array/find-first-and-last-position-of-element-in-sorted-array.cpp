class Solution {
public:
    int findStartingIndex(vector<int> nums,int target){
        int index=-1;
        int left=0; int right=nums.size()-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target) right=mid-1;
            else left=mid+1;
            if(nums[mid]==target) index=mid;
        }
        return index;
    }
    int findEndingIndex(vector<int> nums,int target){
        int index=-1;
        int left=0; int right=nums.size()-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=target) left=mid+1;
            else right=mid-1;
            if(nums[mid]==target) index=mid;
        }
        return index;
    }
    vector<int> searchRange(vector<int>& nums, int target) {
        int left=0; int right=nums.size(); vector<int> result(2,0);
        result[0]=findStartingIndex(nums,target);
        result[1]=findEndingIndex(nums,target);
        return result;
    }
};