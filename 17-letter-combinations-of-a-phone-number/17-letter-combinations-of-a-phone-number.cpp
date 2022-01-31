class Solution {
public:
    vector<string> letterCombinations(string digits) {
        vector<string> result; 
        if(digits.size()==0) return result; 
        vector<string> mapping={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        findCombinations(result,digits,mapping,0,"");
        return result;
    }
    void findCombinations(vector<string> &result,string digits,vector<string>& mapping,int index,string current){
        if(index==digits.size()){
            result.push_back(current);
            return;
        }
        string letters=mapping[digits[index]-'0'];
        for(int i=0;i<letters.size();i++){
            findCombinations(result,digits,mapping,index+1,current+letters[i]);   
        }
    }
};