class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> stack=new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[') stack.push(ch);
            else{
                if(stack.isEmpty()) return false;
                char c=stack.peek();
                if((c=='{' && ch=='}') || (c=='(' && ch==')') || (c=='[' && ch==']')) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}