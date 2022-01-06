class Solution {
    public int secondHighest(String s) {
        int max1=-1;
        int max2=-1;
        for(int i=0;i<s.length();i++)
        {
            int a=s.charAt(i)-'0';
            if(a>=0 && a<=9)
            {
                if(a==max1 || a==max2)
                    continue;
                if(a>max1)
                {
                    max2=max1;
                    max1=a;
                }
                else if(a>max2)
                {
                    max2=a;
                }
            }
        }
        return max2;
    }
}