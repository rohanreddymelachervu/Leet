class Solution {
public:
    int minSetSize(vector<int>& arr) {
        unordered_map<int,int> map;
        for(auto num : arr) map[num]++;
        priority_queue<pair<int,int>> pq;
        for(auto it=map.begin();it!=map.end();it++){
            pq.push({it->second,it->first});
        }
        int target=arr.size()/2;
        int sum=0, count=0;
        for(int i=0;i<pq.size();i++){
            pair<int,int> elem=pq.top();
            pq.pop();
            sum+=elem.first;
            count++;
            if(sum>=target) break;
        }
        return count;
    }
};