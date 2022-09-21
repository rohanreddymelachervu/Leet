class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwise=0, antiClockwise=0, n=distance.length;
        for(int i=start; i!=destination; i=(i+1)%n){
            clockwise += distance[i];
        }
        for(int i=start; i!=destination; i = (i<=0) ? n-1 : i-1){
            antiClockwise += distance[i<=0 ? n-1 : i-1];
        }
        
        return Math.min(clockwise, antiClockwise);
    }
}