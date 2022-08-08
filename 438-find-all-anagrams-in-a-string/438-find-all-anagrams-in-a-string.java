class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        int[] sHash=new int[26];
        int[] pHash=new int[26];
        if(s.length()<p.length()) return result;
        for(char c : p.toCharArray()){
            pHash[c-'a']++;
        }
        int left=0, right=p.length()-1;
        for(int i=left;i<=right;i++){
            sHash[s.charAt(i)-'a']++;
        }
        while(right<s.length()){
            if(Arrays.equals(sHash,pHash)){
                result.add(left);
            }
            sHash[s.charAt(left)-'a']--;
            left++;
            right++;
            if(right<s.length()) sHash[s.charAt(right)-'a']++;
        }
        return result;
    }
}