class Solution {
    public int getMaximumGold(int[][] grid) {
        if(grid.length==0 || grid==null) return 0;
        int m=grid.length, n=grid[0].length, max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    max=Math.max(max, dfs(grid,i,j,m,n,new boolean[m][n]));
                }
            }
        }
        return max;
    }
    private int dfs(int[][] grid,int i,int j,int m,int n,boolean[][] visited){
        if(i<0 || i==m || j<0 || j==n || grid[i][j]==0 || visited[i][j]) return 0;
        visited[i][j]=true;
        int up=dfs(grid,i-1,j,m,n,visited);
        int down=dfs(grid,i+1,j,m,n,visited);
        int left=dfs(grid,i,j-1,m,n,visited);
        int right=dfs(grid,i,j+1,m,n,visited);
        visited[i][j]=false;
        return Math.max(up,Math.max(left,Math.max(right,down))) + grid[i][j];
    }
}