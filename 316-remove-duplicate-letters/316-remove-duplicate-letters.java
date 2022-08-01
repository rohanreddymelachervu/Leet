class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq=new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        boolean[] flag=new boolean[26];
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if(!flag[current-'a']){
                while(!stack.isEmpty() && current<stack.peek() && freq[stack.peek()-'a']>0){
                    char removed=stack.pop();
                    flag[removed-'a']=false;
                }
                stack.push(current);
                flag[current-'a']=true;
            }
            freq[current-'a']--;
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }
}