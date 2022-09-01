/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo=0, hi=n;
        if(n==1) return 1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(!isBadVersion(mid-1) && isBadVersion(mid)) return mid;
            if(!isBadVersion(mid-1) && !isBadVersion(mid)) lo = mid+1;
            if(isBadVersion(mid-1) && isBadVersion(mid)) hi = mid-1;
        }
        return -1;
    }
}