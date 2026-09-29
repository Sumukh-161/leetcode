class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] sortarr = new int[heights.length];
        for(int i = 0; i <= heights.length - 1; i++){
            sortarr[i] = heights[i];
        }
        Arrays.sort(sortarr);
        for(int i = 0; i <= heights.length - 1; i++){
            if(heights[i] != sortarr[i]) count++;
        }
        return count;
    }
}