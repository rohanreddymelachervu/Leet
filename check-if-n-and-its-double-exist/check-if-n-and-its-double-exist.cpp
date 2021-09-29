class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        map<int,int> m; vector<int> temp;
        for(auto num : arr){
            if(num==0){
                temp.push_back(num); continue;
            }
            m[num]++;
        }
        auto mit=m.begin();
        while(mit!=m.end()){
            if(m.find((2*mit->first))!=m.end()) return true;
            mit++;
        }
        if(temp.size()>1) return true;
        return false;
    }
};