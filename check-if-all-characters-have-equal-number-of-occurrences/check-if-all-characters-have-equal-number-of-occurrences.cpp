class Solution {
public:
    bool areOccurrencesEqual(string s) {
        map<char,int> m;
        for(auto c : s) m[c]++;
        auto mit=m.begin();
        int temp=mit->second;
        mit++;
        while(mit!=m.end()){
            if(mit->second!=temp) return false;
            mit++;
        }
        return true;
    }
};