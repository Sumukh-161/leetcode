class Solution {
    public int maxDepth(String s) {
        int maxopen = 0;
        int curopen = 0;
        for( int  i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                curopen++;
                maxopen = Math.max(curopen,maxopen);
            }
            else if(s.charAt(i) == ')') curopen--;
        }
        return maxopen;
    }
}