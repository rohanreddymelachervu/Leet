class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        if(nums.size()==1 and target==nums[0]) return {0,0}; 
        if(nums.size()==0) return {-1,-1};
        if(nums.size()==2){
            if(nums[0]==target and nums[1]==target) return {0,1};
            else if(nums[0]==target and nums[1]!=target) return {0,0};
            else if(nums[1]==target and nums[0]!=target) return {1,1};
            else return {-1,-1};
        }
        vector<int> result(2,0);
        int left=0; int right=nums.size()-1; 
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return finder(mid,result,nums);
            }
            else if(nums[mid]>target) right=mid-1;
            else left=mid+1;
        }
        return {-1,-1};
    }
    vector<int> finder(int index,vector<int>& result,vector<int>& nums){
        int low=index; int high=index;
        while(1){
            if(low==0) break;
            if(nums[low]==nums[low-1]) low--;
            else break;
        }
        while(1){
            if(high==nums.size()-1) break;
            if(nums[high]==nums[high+1]) high++;
            else break;
        }
        result[0]=low; result[1]=high;
        return result;
    }
};