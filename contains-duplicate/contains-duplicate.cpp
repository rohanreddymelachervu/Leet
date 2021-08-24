class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int,int> m;
        for(int i=0;i<nums.size();i++)
        {
            m[nums[i]]++;
        }
        auto mit=m.begin();
        while(mit!=m.end())
        {
            if(mit->second>1) return true;
            mit++;
        }
        return false;
    }
};