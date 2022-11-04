class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int left=0, right=s.length()-1;
        char[] word = s.toCharArray();
        while(left <= right){
            boolean l=set.contains(Character.toLowerCase(word[left]));
            boolean r=set.contains(Character.toLowerCase(word[right]));
            if(l && r){
                char temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                left++; right--;
            }else if(l && !r) right--;
            else left++;
        }
        return new String(word);
    }
}