class Solution {
public:
    string reverseOnlyLetters(string s) {
         int b=0; int e=s.size()-1;
        if(s.size()==1) return s;
        while(b<=e)
        {
            if(isalpha(s[b]) and isalpha(s[e])) 
            {
                swap(s[b],s[e]); b++; e--;
            }
            if(!isalpha(s[b])) b++;
            if(!isalpha(s[e])) e--;
        }
        return s;
    }
};