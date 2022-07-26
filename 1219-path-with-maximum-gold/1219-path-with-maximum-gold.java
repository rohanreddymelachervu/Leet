class Solution {
    public int getMaximumGold(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int max=0, m=grid.length, n=grid[0].length;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    int gold=dfs(grid,i,j,m,n,visited);
                    max=Math.max(max,gold);
                }
            }
        }
        return max;
    }
    private int dfs(int[][] grid,int i,int j,int m,int n,boolean[][] visited){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0 || visited[i][j]) return 0;
        visited[i][j]=true;
        int left=dfs(grid,i,j-1,m,n,visited);
        int right=dfs(grid,i,j+1,m,n,visited);
        int up=dfs(grid,i-1,j,m,n,visited);
        int down=dfs(grid,i+1,j,m,n,visited);
        visited[i][j]=false;
        return Math.max(left,Math.max(right,Math.max(up,down))) + grid[i][j];
    }
}