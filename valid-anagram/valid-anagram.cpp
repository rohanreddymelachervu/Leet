class Solution {
public:
    bool isAnagram(string s, string t) {
        map<char,int> ms; map<char,int> mt;
        if(s.size()!=t.size()) return false;
        for(int i=0;i<s.size();i++)
        {
            ms[s[i]]++;
        }
        for(int i=0;i<t.size();i++)
        {
            mt[t[i]]++;
        }
        auto it1=ms.begin(); auto it2=mt.begin();
        while(it1!=ms.end() and it2!=mt.end())
        {
            if(it1->first!=it2->first) return false;
            if(it1->first==it2->first and it1->second!=it2->second) return false;
            it1++; it2++;
        }
        return true;
    }
};