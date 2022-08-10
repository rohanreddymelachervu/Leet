class Solution {
    public int maxDistToClosest(int[] seats) {
        int maxDist=0, l=-1;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){
                if(l==-1){
                    maxDist=i;
                }else{
                    maxDist=Math.max(maxDist,(i-l)/2);
                }
                l=i;
            }
        }
        if(seats[seats.length-1]==0) maxDist=Math.max(maxDist,seats.length-1-l);
        return maxDist;
    }
}