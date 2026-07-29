class Solution {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];
        char ch ;
        for(int i = 0; i< s.length();i++){
            ch = s.charAt(i);
            freq[ch - 'a']++;
            if(freq[ch - 'a']==2){
                return ch;
            }
        }
        return ' ';
    }
}