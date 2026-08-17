class Solution {
    private boolean isvowel(char c){
        if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U')
        return true;
        else return false;
    }
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int st = 0;
        int end = s.length() - 1;
        while( st < end){
            if(!isvowel(arr[st])) st++;
            else if(!isvowel(arr[end])) end--;
            else{
                char temp;
                temp = arr[st];
                arr[st++] = arr[end];
                arr[end--] = temp;
            }
        }
        return new String(arr);
    }
    
}