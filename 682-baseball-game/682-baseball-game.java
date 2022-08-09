class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        for(String s : ops){
            if(s.equals("D")){
                stack.push(2*stack.peek());
            }else if(s.equals("C")){
                stack.pop();
            }else if(s.equals("+")){
                int temp1=stack.pop();
                int temp2=stack.pop();
                int temp3=temp1+temp2;
                stack.push(temp2); stack.push(temp1); stack.push(temp3);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        int result=0;
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
}