class Solution {
public:
    bool isPerfectSquare(int num) {
        long left=0; long right=num;
        while(left+1<right)
        {
            long midpoint=left+(right-left)/2;
            if(midpoint*midpoint==num) return true;
            else if(midpoint*midpoint<num) left=midpoint;
            else right=midpoint;
        }
        if(right*right==num) return true;
        if(left*left==num) return true;
        return false;
    }
    
};