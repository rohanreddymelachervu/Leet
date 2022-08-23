class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String res = countAndSay(n-1);
        String ans = "";
        int left = 0, right = 0;
        while(right < res.length()){
            int counter = 0;
            while(right<res.length() && res.charAt(left) == res.charAt(right)){
                counter++;
                right++;
            }
            ans += Integer.toString(counter) + String.valueOf(res.charAt(left));
            left = right;
        }
        return ans;
    }
}