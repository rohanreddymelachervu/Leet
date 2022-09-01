class Solution {
    private int f(int i, int j, int[][] grid, Integer[][] dp){
        if(i==grid.length-1 && j==grid[i].length-1) return grid[i][j];
        if(i==grid.length || j==grid[i].length) return (int)1e9;
        if(dp[i][j]!=null) return dp[i][j];
        int right = grid[i][j] + f(i, j+1, grid, dp);
        int down = grid[i][j] + f(i+1, j, grid, dp);
        return dp[i][j] = Math.min(right, down);
    }
    public int minPathSum(int[][] grid) {
        Integer[][] dp=new Integer[grid.length+1][grid[0].length+1];
        return f(0, 0, grid, dp);
    }
}