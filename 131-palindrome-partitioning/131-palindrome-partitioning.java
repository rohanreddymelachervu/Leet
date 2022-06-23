class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        backtrack(result,s,new ArrayList<>(),0);
        return result;
    }
    private void backtrack(List<List<String>> result,String s,List<String> current,int index){
        if(index==s.length()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                current.add(s.substring(index,i+1));
                backtrack(result,s,current,i+1);
                current.remove(current.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }
}