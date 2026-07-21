class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int i ;
        int  j = arr.length - 1;
        while(j>=0 && arr[j] == ' '){
            j--;
        }
        i = j;
        while(i>=0 && arr[i] != ' '){
            i--;
            //count++;
        }
        return j-i;
    }
}