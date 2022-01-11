class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> result; vector<int> current;
        findCombinations(candidates,0,target,current,result);
        return result;
    }
    void findCombinations(vector<int> candidates,int index,int target,vector<int>& current,
                         vector<vector<int>>& result){
        if(index==candidates.size()){
            if(target==0) result.push_back(current);
            return;
        }
        if(candidates[index]<=target){
            current.push_back(candidates[index]);
            findCombinations(candidates,index,target-candidates[index],current,result);
            current.pop_back();
        }
        findCombinations(candidates,index+1,target,current,result);
    }
};