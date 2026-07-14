class Solution {
    public String reverseWords(String s) {
        int end = s.length() - 1;
        StringBuilder ans = new StringBuilder();
        while(0<=end){
            while(end >=0 && s.charAt(end)==' ') {
                end--;
            }
            if(end < 0) break;
            int j = end;
            while(end >=0 && s.charAt(end)!=' ') {
                end--;
            }
            ans.append(s.substring(end+1,j+1));
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}