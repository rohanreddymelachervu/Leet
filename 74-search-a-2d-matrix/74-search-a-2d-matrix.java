class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length, columns=matrix[0].length;
        int top=0, bot=rows-1;
        while(top<=bot){
            int mid=(top+bot)/2;
            if(target>matrix[mid][columns-1]){
                top=mid+1;
            }else if(target<matrix[mid][0]){
                bot=mid-1;
            }else{
                break;
            }
        }
        if(!(top<=bot)) return false;
        int row=(top+bot)/2;
        int l=0, r=columns-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(target>matrix[row][mid]){
                l=mid+1;
            }else if(target<matrix[row][mid]){
                r=mid-1;
            }else return true;
        }
        return false;
        
    }
}