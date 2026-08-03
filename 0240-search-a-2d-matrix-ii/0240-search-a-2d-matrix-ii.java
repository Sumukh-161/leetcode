class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        //if(matrix[0].length == 0 || matrix.length == 0) return false;
        while( row < matrix.length && col >= 0){
            if(matrix[row][col] == target ) 
                return true;
            //return new int[]{row, col};
            else if(matrix[row][col] < target) row++;
            else col--;
        }
        return false;
        //return new int[]{-1,-1};
    }
}