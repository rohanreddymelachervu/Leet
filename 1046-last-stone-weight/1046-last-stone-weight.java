class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            maxPQ.add(i);
        }
        while(maxPQ.size()>1){
            int y=maxPQ.poll();
            int x=maxPQ.poll();
            if(y>x){
                maxPQ.offer(y-x);
            }
        }
        return maxPQ.isEmpty() ? 0 : maxPQ.poll();
    }
}