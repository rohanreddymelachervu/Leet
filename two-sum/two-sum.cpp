class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> m;
        for(int it=0;it<nums.size();it++)
        {
            int num=nums[it]; int com=target-num;
            auto i=m.find(com);
            if(i!=m.end())
            {
                return {i->second,it};
            }
            m[num]=it;
        }
        return {};
    }
};