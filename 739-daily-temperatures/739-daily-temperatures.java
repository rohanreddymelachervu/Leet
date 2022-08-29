class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] result=new int[t.length];
        Arrays.fill(result, 0);
        Stack<Pair<Integer,Integer>> stack=new Stack<>();
        for(int i=0; i<t.length; i++){
            int currTemp=t[i], currIndex=i;
            if(stack.isEmpty() || stack.peek().getKey()>currTemp){
                stack.push(new Pair<>(currTemp, currIndex));
            }else{
                while(!stack.isEmpty() && stack.peek().getKey()<currTemp){
                    Pair<Integer,Integer> top=stack.pop();
                    result[top.getValue()]=currIndex-top.getValue();
                }
                stack.push(new Pair<>(currTemp, currIndex));
            }
        }
        return result;
    }
}