class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i<asteroids.length; i++){
            int curr = asteroids[i];
            if(stack.isEmpty() || curr>0) stack.push(curr);
            else{
                while(true){
                    int peek=stack.peek();
                    if(peek > -curr){
                        break;
                    }else if(peek==-curr){
                        stack.pop();
                        break;
                    }else if(peek<0){
                        stack.push(curr);
                        break;
                    }else{
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.push(curr);
                            break;
                        }
                    }
                }
            }
        }
        int[] result=new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--){
            result[i]=stack.pop();
        }
        return result;
    }
}