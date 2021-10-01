class Solution {
public:
    int distributeCandies(vector<int>& candyType) {
        map<int,int> m;
        for(auto candy : candyType) m[candy]++;
        int maxx=candyType.size()/2;
        if(maxx>m.size()) return m.size();
        else return maxx;
    }
};