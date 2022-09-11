class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows=matrix.length, cols=matrix[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i>0 && j>0 && matrix[i-1][j-1]!=matrix[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}