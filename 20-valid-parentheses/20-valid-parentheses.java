class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        if(s.length()%2!=0) return false;
        for(char c : s.toCharArray()){
            if(c=='[' || c=='(' || c=='{') stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                char peek=stack.peek();
                if((c==')' && peek=='(') || (c==']' && peek=='[') || (c=='}' && peek=='{')) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}