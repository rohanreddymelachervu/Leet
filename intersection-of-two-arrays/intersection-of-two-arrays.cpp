class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
       vector<int> result; unordered_set<int> st1; unordered_set<int> st2;
        for(int i=0;i<nums1.size();i++)
        {
            st1.insert(nums1[i]);
        }
        for(int i=0;i<nums2.size();i++)
        {
            st2.insert(nums2[i]);
        }
        if(st1.size()>=st2.size())
        {
            auto it=st1.begin();
            while(it!=st1.end())
            {
                if(st2.find(*it)!=st2.end())
                {
                    result.push_back(*it);
                }
                it++;
            }
        }
        else
        {
            auto it=st2.begin();
            while(it!=st2.end())
            {
                if(st1.find(*it)!=st1.end())
                {
                    result.push_back(*it);
                }
                it++;
            }
        }
        return result;
    }
};