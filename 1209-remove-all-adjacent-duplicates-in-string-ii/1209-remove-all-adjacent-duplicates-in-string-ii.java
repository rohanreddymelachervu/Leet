class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character,Integer>> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(stack.isEmpty() || stack.peek().getKey()!=ch){
                stack.push(new Pair<>(ch, 1));
            }else{
                if(stack.peek().getValue()==k-1){
                    stack.pop();
                }else{
                    Pair<Character,Integer> top=stack.pop();
                    stack.push(new Pair<>(top.getKey(), top.getValue()+1));
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            Pair<Character,Integer> top=stack.pop();
            for(int i=0; i<top.getValue(); i++){
                sb.insert(0, top.getKey());
            }
        }
        return sb.toString();
    }
}