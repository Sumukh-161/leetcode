class Solution {
    public String removeOccurrences(String s, String part) {
        //StringBuilder str =new StringBuilder();
        while(s.contains(part)){
            int index = s.indexOf(part);
            s = s.substring(0,index) + s.substring(index + part.length());
        }
        return s;
    }
}