class Solution {
    public String reverseVowels(String s) {
        int left=0,right=s.length()-1; 
        HashSet<Character> vowels=new HashSet();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u'); vowels.add('A'); vowels.add('E'); vowels.add('I');
        vowels.add('O'); vowels.add('U');
        char[] word=s.toCharArray();
        while(left<=right){
            if(!vowels.contains(word[left])) left++;
            else if(!vowels.contains(word[right])) right--;
            else{
                char temp=word[left];
                word[left]=word[right];
                word[right]=temp;
                left++; right--;
            }
        }
        return String.valueOf(word);
    }
}