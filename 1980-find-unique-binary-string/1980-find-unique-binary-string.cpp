class Solution {
public:
    string ans=""; bool ok=0;
    unordered_set<string> u; int n=0;
    void helper(int idx,string tmp){
        if(ok) return;
        if(idx==n){
            if(u.find(tmp)==u.end()){
                ans=tmp; ok=1;
            }
            return;
        }
        helper(idx+1,tmp+'0');
        helper(idx+1,tmp+'1');
    }
    string findDifferentBinaryString(vector<string>& nums) {
        n=nums.size();
        for(auto x : nums) u.insert(x);
        string tmp="";
        helper(0,tmp);
        return ans;
    }
};