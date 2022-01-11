class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    DFS(grid,i,j);
                }
            }
        }
        return count;
    }
    public int DFS(char[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0') return 0;
        grid[i][j]='0';
        int count=1;
        count+=DFS(grid,i+1,j)+DFS(grid,i-1,j)+DFS(grid,i,j+1)+DFS(grid,i,j-1);
        return count;
    }
}