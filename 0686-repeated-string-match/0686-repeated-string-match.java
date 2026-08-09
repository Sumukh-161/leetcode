class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder strg = new StringBuilder();
        int j = 0;
        int m = b.length();
        while(strg.length() < m){
            strg.append(a);
            j++;
        }
        if(strg.indexOf(b) != -1) return j;
            strg.append(a);
            j++;
        if(strg.indexOf(b) != -1) return j;    

        return -1;
    }
}