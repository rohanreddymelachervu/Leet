class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length, columns=matrix[0].length;
        int top=0, bottom=rows-1;
        while(top<bottom){
            int mid=(top+bottom)/2;
            if(matrix[mid][columns-1]<target){
                top=mid+1;
            }else if(matrix[mid][0]>target){
                bottom=mid-1;
            }else{
                break;
            }
        }
        if(top>bottom) return false;
        int left=0, right=columns-1;
        int row=(top+bottom)/2;
        while(left<=right){
            int mid=(left+right)/2;
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
}