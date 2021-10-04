class Solution {
public:
    int minOperations(string s) {
        int adiff=0,bdiff=0;
        for(int i=0;i<s.size();i++){
            if(i%2!=s[i]-'0') adiff++;
            if(abs(i%2-1)!=s[i]-'0') bdiff++;
        }
        return min(adiff,bdiff);
    }
};