class Solution {
public:
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int maxx=0;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                if(grid[i][j]==1) maxx=max(DFS(grid,i,j),maxx);
            }
        }
        return maxx;
    }
    int DFS(vector<vector<int>>& grid,int i,int j){
        if(i<0 or i>=grid.size() or j<0 or j>=grid[i].size() or grid[i][j]==0) return 0;
        grid[i][j]=0;
        int count=1;
        count+=DFS(grid,i+1,j)+DFS(grid,i-1,j)+DFS(grid,i,j+1)+DFS(grid,i,j-1);
        return count;
    }
};