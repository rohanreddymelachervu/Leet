/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
public:
    int guessNumber(int n) {
        int left=0; int right=n;
        if(guess(n)==0) return n;
        while(left+1<right)
        {
            int mid=left+(right-left)/2;
            if(guess(mid)==0) return mid;
            else if(guess(mid)==1) left=mid;
            else right=mid;
        }
        return 0;
    }
};