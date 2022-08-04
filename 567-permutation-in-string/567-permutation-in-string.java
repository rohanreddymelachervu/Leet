class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Hash=new int[26];
        int[] s2Hash=new int[26];
        if(s1.length()>s2.length()) return false;
        Arrays.fill(s1Hash,0); Arrays.fill(s2Hash,0);
        for(char s : s1.toCharArray()){
            s1Hash[s-'a']++;
        }
        int left=0, right=s1.length()-1;
        for(int i=left;i<=right;i++){
            s2Hash[s2.charAt(i)-'a']++;   
        }
        while(right<s2.length()){
            if(Arrays.equals(s1Hash,s2Hash)) return true;
            s2Hash[s2.charAt(left)-'a']--;
            right++;
            left++;
            if(right<s2.length()) s2Hash[s2.charAt(right)-'a']++;
        }
        return false;
    }
}