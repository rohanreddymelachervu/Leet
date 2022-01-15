class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> stack=new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='{' || ch=='(' || ch=='[')
                stack.push(ch);
            else{
                if(stack.isEmpty()) return false;
                char c=stack.pop();
                if((ch==')' && c=='(') || (ch=='}' && c=='{') || (ch==']' && c=='[')) continue;
                else return false;
            }
        }
        return stack.isEmpty();
    }
}