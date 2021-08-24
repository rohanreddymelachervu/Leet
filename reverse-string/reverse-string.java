class Solution {
    public void reverseString(char[] s) {
        int b=0;
        char temp;
        int e=s.length-1;
        while(b!=e)
        {
            temp=s[b];
            s[b]=s[e];
            s[e]=temp;
            b++; e--;
            if(b>e)
            {
                break;
            }
        }
    }
}