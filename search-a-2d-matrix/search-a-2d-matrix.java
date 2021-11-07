class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int rows=matrix.length, columns=matrix[0].length;
        int left=0, right=rows*columns-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int midElement=matrix[mid/columns][mid%columns];
            if(midElement==target) return true;
            else if(target<midElement) right=mid-1;
            else left=mid+1;
        }
        return false;
    }
}