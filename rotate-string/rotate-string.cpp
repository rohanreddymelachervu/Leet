class Solution {
public:
    bool rotateString(string s, string goal) {
       for(int i=0;i<s.size();i++){
          s.push_back(s[0]);
          s.erase(s.begin());
          if(s==goal) return true;
       } 
      return false;
    }
};