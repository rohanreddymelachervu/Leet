class Solution {
public:
    int findLeastNumOfUniqueInts(vector<int>& arr, int k) {
        unordered_map<int,int> mp;
        for(int num : arr){
            mp[num]++;
        }
        vector<pair<int,int>> res;
        for(auto it=mp.begin(); it!=mp.end(); it++){
            res.push_back({it->second, it->first});
        }
        sort(res.begin(), res.end());
        int val=0, count=0;
        for(auto p : res){
            if(p.first <= k){
                count++;
                k -= p.first;
            }else break;
        }
        return mp.size() - count;
    }
};