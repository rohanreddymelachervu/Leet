class Solution {
    String ans=""; boolean ok=false;
    HashSet<String> u=new HashSet<String>();
    int n=0;
    public void helper(int idx,String tmp){
        if(ok) return;
        if(idx==n){
            if(!u.contains(tmp)){
                ans=tmp; ok=true;
            }
            return;
        }
        helper(idx+1,tmp+"0");
        helper(idx+1,tmp+"1");
    }
    public String findDifferentBinaryString(String[] nums) {
        n=nums.length;
        for(String x : nums) u.add(x);
        String tmp="";
        helper(0,tmp);
        return ans;
    }
}