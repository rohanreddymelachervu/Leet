class Solution {
public:
    string reverseWords(string s) {
      string result="",temp="";
     s+=" ";
        for(auto i : s)
        {
            if(i==' ')
            {
                reverse(temp.begin(),temp.end());
                result+=temp+" ";
                temp="";
            }
            else
            {
                temp+=i;
            }
        }
        return result.substr(0,result.length()-1);
    }
};