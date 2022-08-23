class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String res = countAndSay(n-1);
        Stack<Pair<Character,Integer>> stack = new Stack<>();
        int r = 0;
        while(r < res.length()){
            if(stack.isEmpty() || stack.peek().getKey() != res.charAt(r)){
                stack.push(new Pair<>(res.charAt(r), 1));
            }else{
                Pair<Character,Integer> top = stack.pop();
                stack.push(new Pair<>(top.getKey(), top.getValue() + 1));
            }
            r++;
        }
        String ans = "";
        while(!stack.isEmpty()){
            Pair<Character,Integer> curr = stack.pop();
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toString(curr.getValue()));
            sb.append(curr.getKey());
            ans =  sb.toString() + ans;
        }
        return ans;
    }
}