class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] result=new int[t.length];
        Arrays.fill(result,0);
        Stack<Pair<Integer,Integer>> stack=new Stack<>(); // temp,ind
        for(int i=0;i<t.length;i++){
            while(!stack.isEmpty() && stack.peek().getKey()<t[i]){
                Pair<Integer,Integer> pair=stack.pop();
                result[pair.getValue()] = i-pair.getValue();
            }
            stack.push(new Pair<>(t[i],i));
        }
        return result;
    }
}