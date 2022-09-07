class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        pq.add(amount[0]);
        pq.add(amount[1]);
        pq.add(amount[2]);
        int ans=0;
        while(pq.peek() != 0){
            int x=pq.poll();
            int y=pq.poll();
            x--;
            y--;
            ans++;
            pq.add(x);
            pq.add(y);
        }
        return ans;
    }
}