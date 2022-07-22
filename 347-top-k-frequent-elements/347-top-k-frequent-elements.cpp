class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        for(auto n : nums){
            mp[n]++;
        }
        priority_queue<pair<int,int>> q;
        for(auto it=mp.begin();it!=mp.end();it++){
            q.push({it->second,it->first});
        }
        vector<int> result;
        for(int i=0;i<k;i++){
            result.push_back(q.top().second);
            q.pop();
        }
        return result;
    }
};