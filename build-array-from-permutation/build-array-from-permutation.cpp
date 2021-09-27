class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        vector<int> result(nums.size(),0);
        auto it=nums.begin();
        while(it!=nums.end()){
            result[*it]=nums[nums[*it]];
            it++;
        }
        return result;
    }
};