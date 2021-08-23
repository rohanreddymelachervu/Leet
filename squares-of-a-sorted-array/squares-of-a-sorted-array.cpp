class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> v; map<int,int> m;
        for(int i=0;i<nums.size();i++)
        {
            int temp=abs(nums[i]);
            m[temp]++;
        }
        auto it=m.begin();
        while(it!=m.end())
        {
            for(int i=0;i<it->second;i++)
            {
                v.push_back((it->first*it->first));
            }
            it++;
        }
        return v;
    }
};