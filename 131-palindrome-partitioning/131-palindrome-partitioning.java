class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        backtrack(result, curr, 0, s);
        return result;
    }
    public void backtrack(List<List<String>> result, List<String> curr, int index, String s){
        if(index == s.length()){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index; i<s.length(); i++){
            if(isPalindrome(index, i, s)){
                String substring = s.substring(index, i+1);
                curr.add(substring);
                backtrack(result, curr, i+1, s);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean isPalindrome(int start, int end, String s){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}