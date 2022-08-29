class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows=matrix.length, cols=matrix[0].length;
        int low=matrix[0][0], high=matrix[rows-1][cols-1];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int num=countNums(matrix, mid);
            if(num<k){
                low=mid+1;
            }else if(num>=k){
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
    public int countNums(int[][] matrix, int mid){
        int i=matrix.length-1, j=0, count=0;
        while(i>=0 && j<matrix[0].length){
            int x=matrix[i][j];
            if(x>mid){
                i--;
            }else{
                count += i+1;
                j++;
            }
        }
        return count;
    }
}