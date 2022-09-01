class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> stack=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        stack.push(0);
        visited.add(0);
        while(!stack.isEmpty()){
            List<Integer> keys = rooms.get(stack.pop());
            for(int key : keys){
                if(!visited.contains(key)){
                    visited.add(key);
                    stack.push(key);
                }
            }
        }
        return visited.size() == rooms.size();
    }
}