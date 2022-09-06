class Solution {
public:
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<vector<int>> result;
        vector<int> current;
        backtrack(result, current, n, k, 1);
        return result;
    }
    void backtrack(vector<vector<int>> &result, vector<int> current, int n, int k, int ind)     {
        if(current.size() == k){
            if(n == 0){
                // vector<int> copy = current;
                result.push_back(current);
            }
            return;
        }    
        for(int i=ind; i<=9; i++){
            current.push_back(i);
            backtrack(result, current, n-i, k, i+1);
            current.pop_back();
        }
    }
};