class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }
            else{
                char peek = stack.peek();
                if(Character.isUpperCase(peek) && Character.isLowerCase(c)
                  || Character.isLowerCase(peek) && Character.isUpperCase(c)){
                    if(Character.toLowerCase(peek) == Character.toLowerCase(c)){
                        stack.pop();
                        continue;
                    }else{
                        stack.push(c);
                    }
                }else{
                    stack.push(c);
                }
            }
        }
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}