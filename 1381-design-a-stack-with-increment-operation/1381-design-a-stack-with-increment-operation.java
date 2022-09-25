class CustomStack {
    List<Integer> stack; int maxSize;
    public CustomStack(int maxSize) {
        stack = new ArrayList<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(stack.size() < maxSize){
            stack.add(x);
        }else{
            return;
        }
    }
    
    public int pop() {
        if(stack.size() == 0) return -1;
        else{
            int last = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return last;
        }
    }
    
    public void increment(int k, int val) {
        if(stack.size() < k){
            for(int i=0; i<stack.size(); i++){
                stack.set(i, stack.get(i)+ val);
            }
        }else{
            for(int i=0; i<k; i++){
                stack.set(i, stack.get(i) + val);
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */