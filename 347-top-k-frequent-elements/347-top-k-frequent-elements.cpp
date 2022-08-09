class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> m;
        vector<int> result;
        for(auto num : nums){
            m[num]++;
        }
        priority_queue<pair<int,int>> pq;
        for(auto it=m.begin();it!=m.end();it++){
            pq.push({it->second,it->first});
        }
        for(int i=0;i<k;i++){
            result.push_back(pq.top().second);
            pq.pop();
        }
        return result;
    }
};