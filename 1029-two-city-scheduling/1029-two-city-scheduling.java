class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int[] refund=new int[costs.length];
        int minCost=0, index=0;
        for(int[] cost : costs){
            refund[index++]=cost[1]-cost[0];
            minCost+=cost[0];
        }
        Arrays.sort(refund);
        int N=costs.length/2;
        for(int i=0;i<N;i++){
            minCost+=refund[i];
        }
        return minCost;
    }
}