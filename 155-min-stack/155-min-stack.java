class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;
    public MinStack() {
        stack=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        int least=0;
        if(!min.isEmpty()){
            least=Math.min(val, min.peek());
        }else least=val;
        min.push(least);
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */