class Solution {
public:
    string removeDuplicates(string s, int k) {
        int n=s.size();
        stack<pair<char,int>> stk;
        for(int i=0;i<n;i++){
            if(stk.empty() or stk.top().first!=s[i]) stk.push({s[i],1});
            else{
                auto prev=stk.top();
                stk.pop();
                stk.push({s[i],prev.second+1});
            }
            if(stk.top().second==k){
                stk.pop();
            }
        }
        string result="";
        while(!stk.empty()){
            auto temp=stk.top();
            while(temp.second-- > 0){
                result.push_back(temp.first);
            }
            stk.pop();
        }
        reverse(result.begin(),result.end());
        return result;
    }
};