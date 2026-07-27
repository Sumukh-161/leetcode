class Solution {
    public int compress(char[] chars) {
        int r = 0;
        int w = 0;
        while(r < chars.length){
            char currch = chars[r];
            int count = 0;
            while(r < chars.length && chars[r] == currch){
                count++;
                r++;
            }
            chars[w] = currch;
            w++;

            if(count > 1){ 
                String coustr = String.valueOf(count);
                for(char digits : coustr.toCharArray() ){
                    chars[w] = digits;
                    w++;
                }
            }
        }
        return w;
    }
}