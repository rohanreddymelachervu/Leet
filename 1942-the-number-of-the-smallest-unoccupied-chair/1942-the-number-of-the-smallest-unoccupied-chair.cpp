class Solution {
public:
    int smallestChair(vector<vector<int>>& times, int targetFriend) {
        vector<pair<int,pair<int,int>>> temp;
        int n = times.size();
        for(int i=0;i<n;i++){
            temp.push_back({times[i][0],{times[i][1],i}});
        }
        sort(temp.begin(),temp.end());
        vector<int> chairs(n,-1);
        for(int i=0;i<n;i++){
            int arrival=temp[i].first;
            int dep=temp[i].second.first;
            int friendNumber=temp[i].second.second;
            for(int j=0;j<n;j++){
                if(chairs[j]<=arrival){
                    chairs[j]=dep;
                    if(friendNumber==targetFriend){
                        return j;
                    }
                    break;
                }
            }
        }
        return -1;
    }
};