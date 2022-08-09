class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] result=new int[t.length];
        Arrays.fill(result,0);
        Stack<Pair<Integer,Integer>> stack=new Stack<>();
        for(int i=0;i<t.length;i++){
            while(!stack.isEmpty() && t[i]>stack.peek().getKey()){
                Pair<Integer,Integer> pop=stack.pop();
                result[pop.getValue()] = i-pop.getValue();
            }
            stack.push(new Pair<>(t[i],i));
        }
        return result;
    }
}